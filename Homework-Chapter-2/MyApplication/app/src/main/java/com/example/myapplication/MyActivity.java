package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.search.SearchActivity;

public class MyActivity extends AppCompatActivity {

    private static final String TAG = "MyActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        String extra = getIntent().getStringExtra("extra");
        Log.d(TAG, "onCreate: "+extra);
        TextView textView = findViewById(R.id.text);
        String placeholder = extra+"😊";
        textView.setText(placeholder);

        findViewById(R.id.tbtn).setOnClickListener(v->{
            Toast.makeText(MyActivity.this, placeholder , Toast.LENGTH_SHORT).show();
        });

        findViewById(R.id.btn).setOnClickListener(v -> {
            Intent intent = new Intent(MyActivity.this, SearchActivity.class);
            startActivity(intent);
        });

    }
}