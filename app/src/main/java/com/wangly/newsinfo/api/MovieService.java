package com.wangly.newsinfo.api;


import com.wangly.newsinfo.modle.HttpResult;
import com.wangly.newsinfo.modle.Results;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by liukun on 16/3/9.
 */
public interface MovieService {

//    @GET("top250")
//    Call<MovieEntity> getTopMovie(@Query("start") int start, @Query("count") int count);

//    @GET("top250")
//    Observable<MovieEntity> getTopMovie(@Query("start") int start, @Query("count") int count);

//    @GET("top250")
//    Observable<HttpResult<List<Results>>> getTopMovie(@Query("start") int start, @Query("count") int count);

//  @GET("top250")
  @GET("movie/index")
  Observable<HttpResult<List<Results>>> getTopMovie(@Query("key") String key, @Query("title") String title);
}
