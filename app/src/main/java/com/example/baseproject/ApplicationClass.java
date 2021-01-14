package com.example.baseproject;

import android.app.Application;
import android.content.Context;

import com.example.baseproject.network.Api;
import com.example.baseproject.network.RetrofitClient;

public class ApplicationClass extends Application {

    private static Application instance;
    private static Api api;

    public static Context getCtx() {
        return instance.getApplicationContext();
    }

    public static Api getApiCallInstance() {
        return api;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        instance = this;

        api = RetrofitClient.getClient().create(Api.class);
    }
}
