package com.example.peanut.weatherwhere.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Peanut on 2017/10/11.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
