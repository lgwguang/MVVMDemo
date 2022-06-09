package com.ligw.mvvmdemo.weather.model;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.ligw.mvvmdemo.BR;


public class WeatherInfo extends BaseObservable {

    private String city;

    private String cityid;

    private String temp1;

    private String temp2;

    private String weather;

    private String img1;

    private String img2;

    private String ptime;

    @Bindable
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
        notifyPropertyChanged(BR.city);
    }
    @Bindable
    public String getCityid() {
        return cityid;
    }

    public void setCityid(String cityid) {
        this.cityid = cityid;
        notifyPropertyChanged(BR.cityid);
    }
    @Bindable
    public String getTemp1() {
        return temp1;
    }

    public void setTemp1(String temp1) {
        this.temp1 = temp1;
        notifyPropertyChanged(BR.temp1);
    }
    @Bindable
    public String getTemp2() {
        return temp2;
    }

    public void setTemp2(String temp2) {
        this.temp2 = temp2;
        notifyPropertyChanged(BR.temp2);
    }
    @Bindable
    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
        notifyPropertyChanged(BR.weather);
    }
    @Bindable
    public String getImg1() {
        return img1;
    }

    public void setImg1(String img1) {
        this.img1 = img1;
        notifyPropertyChanged(BR.img1);
    }
    @Bindable
    public String getImg2() {
        return img2;
    }

    public void setImg2(String img2) {
        this.img2 = img2;
        notifyPropertyChanged(BR.img2);
    }
    @Bindable
    public String getPtime() {
        return ptime;
    }

    public void setPtime(String ptime) {
        this.ptime = ptime;
        notifyPropertyChanged(BR.ptime);
    }
}
