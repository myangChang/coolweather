package com.cmy.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Now {
    @SerializedName("text")
    public String cond_txt;

    @SerializedName("temperature")
    public String temperature;

}
