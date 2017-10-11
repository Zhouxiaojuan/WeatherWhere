package com.example.peanut.weatherwhere.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Peanut on 2017/10/11.
 */

public class Suggestion {

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    public class CarWarsh{
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("txt")
        public String info;
    }

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWarsh carWarsh;

    public Sport sport;
}
