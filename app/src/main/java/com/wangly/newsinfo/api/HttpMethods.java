package com.wangly.newsinfo.api;

import android.util.Log;

import com.wangly.newsinfo.modle.HttpResult;
import com.wangly.newsinfo.modle.Results;
import com.wangly.newsinfo.utils.Constans;

import java.util.List;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Created by liukun on 16/3/9.
 */
public class HttpMethods {

  public static final String BASE_URL = "http://v.juhe.cn/";

  private static final int DEFAULT_TIMEOUT = 5;

  private Retrofit retrofit;
  private MovieService movieService;

  private HttpMethods() {
    OkHttpClient.Builder builder = new OkHttpClient.Builder();
    builder.connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS);

    retrofit = new Retrofit.Builder()
            .client(builder.build())
            //modify by zqikai 20160317 for 对http请求结果进行统一的预处理 GosnResponseBodyConvert
//                .addConverterFactory(GsonConverterFactory.create())
            .addConverterFactory(ResponseConvertFactory.create())
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            .baseUrl(BASE_URL)
            .build();

    movieService = retrofit.create(MovieService.class);
  }

  //在访问HttpMethods时创建单例
  private static class SingletonHolder{
    private static final HttpMethods INSTANCE = new HttpMethods();
  }

  //获取单例
  public static HttpMethods getInstance(){
    return SingletonHolder.INSTANCE;
  }

  public void testMoveics(){
    movieService.getTopMovie(Constans.APPKEY,"钢铁侠3").subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .unsubscribeOn(Schedulers.io())
            .subscribe(new Subscriber<HttpResult<List<Results>>>() {
              @Override
              public void onCompleted() {
                Log.i("wangly", "onCompleted");
              }

              @Override
              public void onError(Throwable e) {
                Log.e("wangly", "onCompleted");
              }

              @Override
              public void onNext(HttpResult<List<Results>> listHttpResult) {
                Log.i("wangly", listHttpResult.getResultcode() +"---"+listHttpResult.getError_code()+""
                +listHttpResult.getResult().toString());
              }
            });
  }



  /**
   * @param subscriber
   */
  /**
   *
   * @param subscriber 由调用者传过来的观察者对象
   * @param appkey 聚合数据当中的key
   * @param title 标题
     */
  public void getTopMovie(Subscriber<List<Results>> subscriber, String appkey, String title){

//        movieService.getTopMovie(start, count)
//                .map(new HttpResultFunc<List<Results>>())
//                .subscribeOn(Schedulers.io())
//                .unsubscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(subscriber);

    Observable observable = movieService.getTopMovie(appkey, title)
            .map(new HttpResultFunc<List<Results>>());

    toSubscribe(observable, subscriber);
  }

  private <T> void toSubscribe(Observable<T> o, Subscriber<T> s){
    o.subscribeOn(Schedulers.io())
            .unsubscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(s);
  }

  /**
   * 用来统一处理Http的resultCode,并将HttpResult的Data部分剥离出来返回给subscriber
   *
   * @param <T>   Subscriber真正需要的数据类型，也就是Data部分的数据类型
   */
  private class HttpResultFunc<T> implements Func1<HttpResult<T>, T>{

    @Override
    public T call(HttpResult<T> httpResult) {
      if (httpResult.getError_code() != 0) {
        throw new ApiException(100);
      }
      return httpResult.getResult();
    }
  }

}
