package com.teknodate.drkim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        Thread zamanlayici = new Thread() {
            public void run () {

                try {

                    sleep(2000);

                }

                catch (InterruptedException e) {
                Toast.makeText(SplashScreen.this, e+"", Toast.LENGTH_SHORT).show();}

                finally {
                    Intent gecis = new Intent(SplashScreen.this,MainActivity.class);
                    startActivity(gecis);
                    finish();
                }

            }


        };

        zamanlayici.start();
    }
}
