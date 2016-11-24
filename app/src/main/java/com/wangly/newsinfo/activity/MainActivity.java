package com.wangly.newsinfo.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.wangly.newsinfo.R;
import com.wangly.newsinfo.api.HttpMethods;
import com.wangly.newsinfo.modle.Results;
import com.wangly.newsinfo.utils.Constans;

import java.util.List;

import rx.Subscriber;

/**
 * 在使用Retrofit+RxJava 两者结合的时候，需要定制Json 返回的格式
 * 数据，否则在返回数据的时候就会出现一些异常信息
 * 在如果在
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getMovices();

//                HttpMethods.getInstance().testMoveics();
            }
        });


    }

    private void getMovices(){

        HttpMethods.getInstance().getTopMovie(new Subscriber<List<Results>>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {
                Log.e("wangly", e.getMessage());
            }

            @Override
            public void onNext(List<Results> subjects) {

                Log.i("wangly", subjects.get(0).getMovieid());
            }
        }, Constans.APPKEY,"钢铁侠3");

    }
}
