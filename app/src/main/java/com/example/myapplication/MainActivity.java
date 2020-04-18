package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.text.Html;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ViewPager mvp;
    LinearLayout mll;
    SliderAdapter sliderAdapter;
    TextView[] dots;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mvp=findViewById(R.id.slideViewPager);
        mll=findViewById(R.id.dots);

        sliderAdapter = new SliderAdapter(this);
        mvp.setAdapter(sliderAdapter);
        //addDotsIndicator();
    }
/*
    public void addDotsIndicator(){
        dots= new TextView[4];
        for(int i=0;i<dots.length;i++){
            dots[i]=new TextView(this);
            dots[i].setText(Html.fromHtml());
            dots[i].setTextSize(35);
            dots[i].setTextColor(getResources().getColor(R.color.colorgrey));

            mll.addView(dots[i]);
        }
    }*/
}
