package com.google.cloud.examples.speechrecognition;

public class ApiUtils {
    private ApiUtils() {}

    public static final String BASE_URL = "http://192.168.8.101:8000/";

    public static APIService getAPIService() {

        return RetrofitClient.getClient(BASE_URL).create(APIService.class);
    }

}
