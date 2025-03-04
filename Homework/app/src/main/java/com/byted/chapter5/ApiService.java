package com.byted.chapter5;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    // https://wanandroid.com/wxarticle/chapters/json
    @GET("wxarticle/chapters/json")
    Call<ArticleResponse> getArticles();

    // todo 添加api
    // https://www.wanandroid.com/user/register
    //方法：POST
    //	username,password,repassword
    // https://www.wanandroid.com/user/register
    @FormUrlEncoded
    @POST("user/register")
    Call<RegisterResponse> register(
            @Field("username") String username,
            @Field("password") String password,
            @Field("repassword") String repassword
}
