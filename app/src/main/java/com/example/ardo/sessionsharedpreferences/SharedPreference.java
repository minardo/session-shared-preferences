package com.example.ardo.sessionsharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreference {

    public static final String PREF_NAME = "AOP_PREFS";
    public static final String PREF_KEY = "AOP_PREFS_String";

    public SharedPreference() {
        super();
    }


    public void save(Context context, String text) {
        SharedPreferences settings;
        SharedPreferences.Editor editor;

        settings = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE); // 1
        editor = settings.edit(); // 2
        editor.putString(PREF_KEY, text); // 3
        editor.commit(); // 4
    }


    public String getValue(Context context) {
        SharedPreferences settings;
        String text;

        settings = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        text = settings.getString(PREF_KEY, null);
        return text;
    }

    public void clearSharedPreference(Context context) {
        SharedPreferences settings;
        SharedPreferences.Editor editor;

        settings = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        editor = settings.edit();

        editor.clear();
        editor.commit();
    }


    public void removeValue(Context context) {
        SharedPreferences settings;
        SharedPreferences.Editor editor;

        settings = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        editor = settings.edit();

        editor.remove(PREF_KEY);
        editor.commit();
    }

}
