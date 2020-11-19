package com.example.databindingexample.Presenter;

import com.example.databindingexample.TemperatureData;

public interface MainActivityContract {
    public interface Presenter{
        void onShowData(TemperatureData temperatureData);
        void showList();
    }

    public interface View{
        void showData(TemperatureData temperatureData);
    }
}
