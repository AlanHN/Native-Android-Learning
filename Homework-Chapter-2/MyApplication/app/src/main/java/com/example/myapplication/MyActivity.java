package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.myapplication.search.SearchActivity;

public class MyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        String extra = getIntent().getStringExtra("extra");
        Log.d(extra,extra);
        TextView textView = findViewById(R.id.text);
        String placeholder = extra+"😊";
        textView.setText(placeholder);

        findViewById(R.id.btn).setOnClickListener(v -> {
            Intent intent = new Intent(MyActivity.this, SearchActivity.class);
            startActivity(intent);
        });
    }
}