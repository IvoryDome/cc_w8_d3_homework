package com.android.ryan.starcraftmaps;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.android.ryan.starcraftmaps.MapList;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MapList maps = new MapList();
        ArrayList<Map> mapList = maps.getList();

        MapListAdapter mapListAdapter = new MapListAdapter(this, mapList);


        ListView mapsListView = findViewById(R.id.mapsListViewID);

        mapsListView.setAdapter(mapListAdapter);
    }

    public void onListItemClick(View listItems){
        Map map = (Map)listItems.getTag();
        Log.d("Map Name: ", map.getName());
        Intent intent = new Intent(this, MapDetailActivity.class);
        intent.putExtra("map", map);
        startActivity(intent);

    }
}
