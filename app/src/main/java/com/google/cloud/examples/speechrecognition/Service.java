package com.google.cloud.examples.speechrecognition;

import android.util.Log;

import io.reactivex.functions.Consumer;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Service {
    public static void sendPost(String input, final Consumer<String> consumer) {
        ApiUtils.getAPIService().savePost(RequestBody.create(MediaType.parse("text/plain"), input)).enqueue(new Callback<ResponseObj>() {
            @Override
            public void onResponse(Call<ResponseObj> call, Response<ResponseObj> response) {

                if(response.isSuccessful()) {
                    try {
                        consumer.accept(response.body().getResponse());
                    } catch (Exception e) {
                        Log.e("Consumer Error", "Consumer Error", e);
                    }
                }
            }

            @Override
            public void onFailure(Call<ResponseObj> call, Throwable t) {
                Log.e("Resful Error", "Resful Error", t);
            }
        });
    }

}
