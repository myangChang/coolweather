package com.cmy.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {
    @SerializedName("status")
    public String status;
    public Update update;
    public Basic basic;
//    public AQI aqi;
//    public Now now;
//    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

    public class Update{
        @SerializedName("loc")
        public String time;
    }
}
