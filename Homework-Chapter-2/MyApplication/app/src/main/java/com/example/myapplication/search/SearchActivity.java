package com.example.myapplication.search;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends AppCompatActivity {

    //Debug usage
    private static final String TAG = "SearchActivity";

    private final SearchAdapter mSearchAdapter = new SearchAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        RecyclerView mRecyclerView = findViewById(R.id.rv);
        mRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        mRecyclerView.setAdapter(mSearchAdapter);

        final List<String> items = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            items.add("这是第 " + i + " 行");
        }
        mSearchAdapter.notifyItems(items);

        SearchLayout mSearchLayout = findViewById(R.id.search);
        mSearchLayout.setOnSearchTextChangedListener(text -> {
            Log.i(TAG, "afterChanged: " + text);
            List<String> filters = new ArrayList<>();
            for (String item : items) {
                if (item.contains(text)) {
                    filters.add(item);
                }
            }
            mSearchAdapter.notifyItems(filters);
        });

    }
}