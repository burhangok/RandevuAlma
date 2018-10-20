package com.teknodate.drkim;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class RandevulariGoruntule extends AppCompatActivity {


    public String hasta, randevu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_randevulari_goruntule);


        SessionManager session = new SessionManager(getApplicationContext());


        try {

            if (session != null) {
                HashMap<String, String> randevular = session.randevulariGetir();




                for (String hastalar : randevular.keySet()) {
                    for (String randevu : randevular.values()) {
                        Toast.makeText(this, "HASTA: " + hastalar + " RANDEVU  "+randevu, Toast.LENGTH_SHORT).show();
                    }
                }
                }



        } catch (Exception e) {

        }

    }
}
