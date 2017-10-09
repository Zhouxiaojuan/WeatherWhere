package com.example.peanut.weatherwhere.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Peanut on 2017/10/9.
 */

public class County extends DataSupport {

    private int id;
    private String countyName;
    private String weathweId;
    private int cityId;

    public int getId(){
        return id;
    }

    public String getCountyName(){
        return countyName;
    }

    public String getWeathweId(){
        return weathweId;
    }

    public int getCityId(){
        return cityId;
    }

    public void setId(int id){
        this.id=id;
    }

    public void setCountyName(String countyName){
        this.countyName=countyName;
    }

    public void setWeathweId(String weathweId){
        this.weathweId=weathweId;
    }

    public void setCityId(int cityId){
        this.cityId=cityId;
    }
}
