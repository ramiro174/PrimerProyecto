package com.ramiro174.primerproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Inicio extends AppCompatActivity {
     TextView   te;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        te =findViewById(R.id.txt1);
      new CountDownTimer(5000, 1000) {
            @Override
            public void onTick(long l) {
                te.setText(String.valueOf((l/1000)));
            }
        
            @Override
            public void onFinish() {
              startActivity(new Intent(getApplicationContext(),MainActivity.class));
                finish();
                
                
            }
        }.start();
        
        
    }
   
}