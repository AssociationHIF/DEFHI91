package com.association.defhi91;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPref {
    SharedPreferences sPref;

    public SharedPref(Context context){
        sPref = context.getSharedPreferences("filename", context.MODE_PRIVATE);
    }

    public void setNightModeState(Boolean state){
        SharedPreferences.Editor editor = sPref.edit();
        editor.putBoolean("Nightmode", state);
        editor.commit();
    }

    public boolean loadNightModeState(){
        Boolean state = sPref.getBoolean("Nightmode", false);
        return state;
    }



}
