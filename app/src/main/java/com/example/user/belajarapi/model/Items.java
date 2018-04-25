package com.example.user.belajarapi.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by User on 3/7/2018.
 */

public class Items {
    @SerializedName("items")
    public List<Jadwal> items;

    public List<Jadwal> getItems() {return items;}

    public void setItems(List<Jadwal> Items) {this.items =items;}

    public Items(List<Jadwal> Items) {this.items = items; }
}
