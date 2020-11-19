package com.example.databindingexample;

import android.content.Context;
import android.content.Intent;

import com.example.databindingexample.Presenter.MainActivityContract;
import com.example.databindingexample.View.SecondActivity;

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

    @Override
    public void showList() {
        Intent i = new Intent(context, SecondActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(i);
    }
}
