package com.example.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InputActivty extends AppCompatActivity {
    Button btnpindah;
    EditText EtxPindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_activty);
        btnpindah = findViewById(R.id.btn_pindah);
        EtxPindah = findViewById(R.id.txt_input);
        btnpindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Pindah = new Intent(InputActivty.this, LastActivity.class) .putExtra("data", EtxPindah.getText().toString());
                startActivity(Pindah);
            }
        });
    }
}
