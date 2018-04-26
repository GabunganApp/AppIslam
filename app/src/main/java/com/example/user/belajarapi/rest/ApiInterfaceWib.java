package com.example.user.belajarapi.rest;

import com.example.user.belajarapi.model.Items;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by User on 4/21/2018.
 */

public interface ApiInterfaceWib {
    @GET("Jakarta/{periode}/daily.json")
    Call<Items> getJadwalSholat(@Path("periode") String periode);

}

