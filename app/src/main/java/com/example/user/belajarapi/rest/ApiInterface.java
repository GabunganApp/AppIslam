package com.example.user.belajarapi.rest;

import android.content.ClipData;

import com.example.user.belajarapi.model.Items;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by User on 3/7/2018.
 */

public interface ApiInterface {
    @GET("samarinda/{periode}/dayli.json")
    Call<Items> getJadwalSholat(@Path("periode") String periode);
}
