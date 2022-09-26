package com.example.app_20753073_tugasintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Intro {

    @Override
protected void onCreate (Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_intro);

    Button back = findViewById(R.id.btnkembali);
    back.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {finish();}
    });
    }
    }