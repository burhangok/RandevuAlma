package com.teknodate.drkim;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.HashMap;

public class SessionManager {

    SharedPreferences pref;
    SharedPreferences.Editor editor;
    Context _context;
    int PRIVATE_MODE = 0;

    //User Session Process
    public static final String PREF_NAME = "RandevuBilgileri";
    public static final String KEY_HASTA = "hasta";
    public static final String KEY_RANDEVU = "randevu";






    public SessionManager(Context context) {
        this._context = context;
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();

    }


    public void randevuOlustur(String hasta, String randevu) {
        editor.putString(KEY_HASTA, hasta );
        editor.putString(KEY_RANDEVU,randevu);
        editor.commit();
    }


    public HashMap<String, String> randevulariGetir() {

        HashMap<String, String> randevular = new HashMap<String, String>();

        randevular.put(pref.getString(KEY_HASTA, null), pref.getString(KEY_RANDEVU, null));




        // return randevular
        return randevular;
    }






}