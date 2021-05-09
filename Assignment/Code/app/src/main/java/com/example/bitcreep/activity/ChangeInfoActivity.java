package com.example.bitcreep.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bitcreep.R;
import com.example.bitcreep.utils.Constants;
import com.facebook.drawee.backends.pipeline.Fresco;

public class ChangeInfoActivity extends AppCompatActivity {

    // 创建时初始化
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Fresco.initialize(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_changeinfo);

        Button save = findViewById(R.id.save);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChangeInfoActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }


}
