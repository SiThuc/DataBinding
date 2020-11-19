package com.example.databindingexample.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.widget.Toast;

import com.example.databindingexample.MainActivityPresenter;
import com.example.databindingexample.TemperatureData;
import com.example.databindingexample.Presenter.MainActivityContract;
import com.example.databindingexample.R;
import com.example.databindingexample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        MainActivityPresenter mainActivityPresenter = new MainActivityPresenter(this, getApplicationContext());
        TemperatureData temperatureData = new TemperatureData("Hamburg", "10");
        binding.setTemp(temperatureData);
        binding.setPresenter(mainActivityPresenter);
    }

    @Override
    public void showData(TemperatureData temperatureData) {
        String celsius = temperatureData.getCelsius();
        Toast.makeText(this, "Temperature: "+celsius, Toast.LENGTH_SHORT).show();
    }
}