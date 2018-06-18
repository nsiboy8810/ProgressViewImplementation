package com.example.android.progressviewimplementation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import jp.co.recruit_mp.android.circleprogressview.CircleProgressView;

public class MainActivity extends AppCompatActivity {
    CircleProgressView circleProgressView;
    CircleProgressView circleProgressView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        circleProgressView = findViewById(R.id.circleprogressview);




        // Set progress
        circleProgressView.setProgress(0.0f);
// Set stroke width
        circleProgressView.setStrokeWidthPx(50);
// Set progress animation
        circleProgressView.setProgressAnimation(0.5f, 5000);

// Set colors

        circleProgressView.setForegroundColor(getResources().getColor(R.color.demo_brown));
        circleProgressView.setBackgroundColor(getResources().getColor(R.color.demo_orange));

        circleProgressView2 = findViewById(R.id.circleprogressview2);




        // Set progress
        circleProgressView2.setProgress(0.0f);
// Set stroke width
        circleProgressView2.setStrokeWidthPx(50);
// Set progress animation
        circleProgressView2.setProgressAnimation(0.7f, 5000);

// Set colors

        circleProgressView2.setForegroundColor(getResources().getColor(R.color.demo_brown));
        circleProgressView2.setBackgroundColor(getResources().getColor(R.color.demo_orange));
    }
}
