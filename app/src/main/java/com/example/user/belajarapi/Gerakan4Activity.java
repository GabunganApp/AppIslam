package com.example.user.belajarapi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class Gerakan4Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gerakan4);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.lanjut)
    public void lanjut() {
        Intent intent = new Intent(Gerakan4Activity.this,Gerakan5Activity.class);
        startActivity(intent);
    }
}
