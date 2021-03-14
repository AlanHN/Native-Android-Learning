package com.ss.android.ugc.demo;

import android.os.Bundle;
import android.view.View;

import com.ss.android.ugc.demo.widget.Clock;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ClockActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clock);
        View mRootView = findViewById(R.id.root);
        Clock mClockView = findViewById(R.id.clock);
    }

}
