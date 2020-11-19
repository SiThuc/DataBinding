package com.example.databindingexample;

import android.content.Context;

public class MainActivityPresenter implements MainActivityContract.Presenter{
    private MainActivityContract.View view;
    private Context context;

    public MainActivityPresenter(MainActivityContract.View view, Context context) {
        this.view = view;
        this.context = context;
    }

    @Override
    public void onShowData(TemperatureData temperatureData) {
        view.showData(temperatureData);
    }
}
