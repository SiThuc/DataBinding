package com.example.databindingexample;

public interface MainActivityContract {
    public interface Presenter{
        void onShowData(TemperatureData temperatureData);
    }

    public interface View{
        void showData(TemperatureData temperatureData);
    }
}
