package com.soft.portfolioapp.controler;

import android.content.Context;
import android.content.SharedPreferences;

public class PrefManager {

    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    Context mContext;

    //Shared pref mode
    int PRIVATE_MODE = 0;

    //shared preferences file name
    private static final String PREF_NAME = "bem-vindo";
    private static final String LANCANDO_PRIMEIRA_VEZ = "lancando primeira vez";

    public PrefManager(Context context) {
        this.mContext = context;
        preferences = mContext.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = preferences.edit();
    }

    public void setFirstTimeLaunch(boolean isFirstTime) {
        editor.putBoolean(LANCANDO_PRIMEIRA_VEZ, isFirstTime);
        editor.commit();
    }

    public boolean isFirstTimeLaunch(){
        return preferences.getBoolean(LANCANDO_PRIMEIRA_VEZ, true);
    }
}
