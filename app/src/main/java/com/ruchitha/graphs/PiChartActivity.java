package com.ruchitha.graphs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class PiChartActivity extends AppCompatActivity {
    PieChart pieChart;
    ArrayList<PieEntry> pieEntries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pi_chart);
        pieChart=findViewById(R.id.pichart);
        pieEntries=new ArrayList<>();
        pieEntries.add(new PieEntry( (float)1005.55,"2000"));
        pieEntries.add(new PieEntry( (float)2005.45,"3000"));
        pieEntries.add(new PieEntry( (float)3005.55,"4000"));
        pieEntries.add(new PieEntry( (float)4005.35,"5000"));
        pieEntries.add(new PieEntry( (float)5005.25,"6000"));
        PieDataSet dataSet=new PieDataSet(pieEntries,"Marketing");
        dataSet.setColors(ColorTemplate.JOYFUL_COLORS);
        dataSet.setValueTextSize(17f);
        dataSet.setValueTextColor(android.R.color.white);
        PieData pieData=new PieData(dataSet);
        pieChart.setData(pieData);
        pieChart.animate();
        pieChart.setCenterText("Marketing");
        pieChart.setCenterTextSize(30f);

    }
}