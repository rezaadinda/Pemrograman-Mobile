package com.example.hmjpolines;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toolbar;

public class profil extends AppCompatActivity {

    private TextView namaProfile, namaDeskripsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        namaProfile = findViewById(R.id.Nama);
        namaDeskripsi = findViewById(R.id.Desc);


        String namaProfil = getIntent().getStringExtra("namaProfile");
        String namaDesc = getIntent().getStringExtra("namaDesc");

        namaProfile.setText(namaProfil);
        namaDeskripsi.setText(namaDesc);
    }
}
