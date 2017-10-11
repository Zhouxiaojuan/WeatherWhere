package com.example.peanut.weatherwhere.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Peanut on 2017/10/11.
 */

public class Basic {

    @SerializedName("city")//@SerializedName注解的方式来让JsON字段和java字段之间建立映射关系
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
