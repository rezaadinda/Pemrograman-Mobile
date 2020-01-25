package com.example.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class LastActivity extends AppCompatActivity {
TextView Etx_Pindah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);
        Etx_Pindah = findViewById(R.id.Etx_Pindah);
        Etx_Pindah.setText(getIntent().getStringExtra("data"));
    }
}
