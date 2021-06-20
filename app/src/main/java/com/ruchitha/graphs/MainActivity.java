package com.ruchitha.graphs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openBarChart(View view) {
        Intent i=new Intent(this,BarGraphActivity.class);
        startActivity(i);
    }

    public void openPieChart(View view) {
        Intent i=new Intent(this,PiChartActivity.class);
        startActivity(i);
    }
}