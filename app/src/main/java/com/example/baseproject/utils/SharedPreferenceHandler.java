package com.example.baseproject.utils;

import android.content.SharedPreferences;

import com.example.baseproject.ApplicationClass;
import com.example.baseproject.config.Constants;

import static android.content.Context.MODE_PRIVATE;

public class SharedPreferenceHandler {

    private static final SharedPreferences preference = ApplicationClass.getCtx().getSharedPreferences(Constants.APP_NAME + "_Preference", MODE_PRIVATE);
    private static final SharedPreferences.Editor editor = preference.edit();

    //here you can make get/set SP helper methods

}
