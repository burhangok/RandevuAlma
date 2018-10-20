package com.teknodate.drkim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RandevuKaydet extends AppCompatActivity {

    public EditText hastaEditText, randevuEditText;

    public String hasta ,randevu;

    public Button kaydetBtn;

    public   SessionManager sessionManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_randevu_kaydet);

        hastaEditText=findViewById(R.id.hasta);
        randevuEditText=findViewById(R.id.randevu);

        kaydetBtn=findViewById(R.id.kaydet);

         sessionManager = new SessionManager(getApplicationContext());

        kaydetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasta=hastaEditText.getText().toString();
                randevu=randevuEditText.getText().toString();
                sessionManager.randevuOlustur(hasta,randevu);

                Intent geriDon = new Intent(RandevuKaydet.this,MainActivity.class);

                startActivity(geriDon);
                finish();
            }
        });

    }
}
