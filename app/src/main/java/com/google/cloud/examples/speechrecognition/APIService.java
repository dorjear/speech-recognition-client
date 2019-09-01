package com.google.cloud.examples.speechrecognition;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface APIService {

    @POST("/test")
    Call<ResponseObj> savePost(@Body RequestBody input);
}