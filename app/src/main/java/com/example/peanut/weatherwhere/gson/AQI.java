package com.example.peanut.weatherwhere.gson;

/**
 * Created by Peanut on 2017/10/11.
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
