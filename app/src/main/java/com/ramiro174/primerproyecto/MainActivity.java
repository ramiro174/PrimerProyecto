package com.ramiro174.primerproyecto;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.view.DragEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {
  


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    
  
    findViewById(R.id.btn1).setOnClickListener(this);
    
    findViewById(R.id.btn2).setOnClickListener(this);
    findViewById(R.id.btn2).setOnClickListener(this);
    

 }
    
    @Override
    public void onClick(View view) {
      
                Button  b=(Button ) view;
                
        
        TextView  l=(TextView)  findViewById(R.id.lbl1);
        l.setText( b.getText().toString());
        
        
        
    }
}
