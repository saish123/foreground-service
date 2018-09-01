package com.sawant.foreground_service;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void buttonClciked(View view){
        Button clickButton = (Button)view;

        Intent service = new Intent(MainActivity.this,ForegroundService.class);
        if (!ForegroundService.IS_SERVICE_RUNNING){
            service.setAction(Constants.ACTION.STARTFOREGROUND_ACTION);
            ForegroundService.IS_SERVICE_RUNNING = true;
            clickButton.setText(getResources().getString(R.string.stop_service));
        }
        else{
            service.setAction(Constants.ACTION.STOPFOREGROUND_ACTION);
            ForegroundService.IS_SERVICE_RUNNING =false;
            clickButton.setText(getResources().getString(R.string.start_service));
        }
        startService(service);

    }
}
