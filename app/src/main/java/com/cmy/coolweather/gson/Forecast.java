package com.cmy.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Forecast {
    @SerializedName("date")
    public String date;

    public Temperature temperature;

    public More more;

    public class Temperature{
        @SerializedName("tmp_max")
        public String max;
        @SerializedName("tmp_min")
        public String min;
    }

    public class More{
        @SerializedName("cond_txt_d")
        public String info;
    }
}
