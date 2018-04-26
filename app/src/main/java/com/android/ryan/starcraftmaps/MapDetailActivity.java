package com.android.ryan.starcraftmaps;

import android.content.Intent;
import android.graphics.Movie;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MapDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_detail);

        Intent intent = getIntent();
        Map map = (Map) intent.getSerializableExtra("map");
        TextView mapDetailTextView = findViewById(R.id.mapDetailTextViewID);
        mapDetailTextView.setText(map.getName());
    }
}
