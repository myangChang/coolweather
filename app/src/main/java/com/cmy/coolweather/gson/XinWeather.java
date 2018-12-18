package com.cmy.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class XinWeather {
    @SerializedName("location")
    public Basic basic;
    @SerializedName("now")
    public Now now;
    @SerializedName("last_update")
    public String last_update;

}
