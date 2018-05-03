package com.example.user.belajarapi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by User on 4/21/2018.
 */

public class HomeActivity extends AppCompatActivity{
    @BindView(R.id.doa)Button doa;
    @BindView(R.id.jadwal)Button jadwal;
    @BindView(R.id.praktek)Button praktek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.jadwal)
    public void jadwal() {
        Intent intent = new Intent(HomeActivity.this, MainActivity.class);
        startActivity(intent);
    }
    @OnClick(R.id.praktek)
    public void praktek() {
        Intent intent = new Intent(HomeActivity.this, PraktekActivity.class);
        startActivity(intent);
    }
    @OnClick(R.id.doa)
    public void doa() {
        Intent intent = new Intent(HomeActivity.this, Doa1Activity.class);
        startActivity(intent);
    }
}
