package com.example.user.belajarapi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.user.belajarapi.model.Items;
import com.example.user.belajarapi.model.Jadwal;
import com.example.user.belajarapi.rest.ApiClientWib;
import com.example.user.belajarapi.rest.ApiInterfaceWib;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by User on 4/21/2018.
 */

public class WibActivity extends AppCompatActivity {

    @BindView(R.id.tvSubuh)
    TextView tvSubuh;

    @BindView(R.id.tvZuhur)
    TextView tvZuhur;

    @BindView(R.id.tvAshar)
    TextView tvAshar;

    @BindView(R.id.tvMagrhib)
    TextView tvMaghrib;

    @BindView(R.id.tvIsya)
    TextView tvIsya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wib_activity);
        ButterKnife.bind(this);
    }

    private void loadData(List<Jadwal> jadwal) {
        for (Jadwal data : jadwal) {
            tvSubuh.setText(data.subuh);
            tvZuhur.setText(data.zuhur);
            tvAshar.setText(data.ashar);
            tvMaghrib.setText(data.maghrib);
            tvIsya.setText(data.isya);
        }

    }
    @OnClick(R.id.next)
    public void login() {
        Intent intent = new Intent(WibActivity.this, WitActivity.class);
        startActivity(intent);
    }
    @OnClick(R.id.lokasi)
    public void lokasi() {
        Intent intent = new Intent(WibActivity.this, Maps1Activity.class);
        startActivity(intent);
    }

    @OnClick(R.id.btnLoadData)
    void actionLoadData() {
        ApiInterfaceWib apiService = ApiClientWib.getClient().create(ApiInterfaceWib.class);

        retrofit2.Call<Items> call = apiService.getJadwalSholat("Jakarta");

        call.enqueue(new Callback<Items>() {
            @Override
            public void onResponse(retrofit2.Call<Items> call, Response<Items> response) {
                List<Jadwal> jadwal = response.body().getItems();
                loadData(jadwal);
            }

            @Override
            public void onFailure(retrofit2.Call<Items> call, Throwable t) {

            }
        });

    }
}

