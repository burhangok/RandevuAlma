package com.teknodate.drkim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    public Button kaydetBtn, goruntuleBtn,kurumsalBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kaydetBtn=findViewById(R.id.kaydet);

        goruntuleBtn=findViewById(R.id.goruntule);

        kurumsalBtn= findViewById(R.id.kurumsal);

        kurumsalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kurumsalaGit = new Intent(MainActivity.this,Kurumsal.class);
                startActivity(kurumsalaGit);

            }
        });

        kaydetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent randevuKaydet = new Intent(MainActivity.this,RandevuKaydet.class);
                startActivity(randevuKaydet);

            }
        });

        goruntuleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent randevuGoruntule = new Intent(MainActivity.this,RandevulariGoruntule.class);
                startActivity(randevuGoruntule);
            }
        });


    }
}
