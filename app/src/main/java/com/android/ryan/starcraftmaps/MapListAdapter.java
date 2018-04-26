package com.android.ryan.starcraftmaps;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.android.ryan.starcraftmaps.Map;
import com.android.ryan.starcraftmaps.R;

import java.util.ArrayList;

public class MapListAdapter extends ArrayAdapter<Map> {

    public MapListAdapter(Context context, ArrayList<Map> maps) {
        super(context, 0, maps);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.map_list_item, parent, false);
        }


        Map currentMap = getItem(position);

        TextView mapName = listItemView.findViewById(R.id.mapNameTextViewID);

        mapName.setText(currentMap.getName());


        return listItemView;

    }
}
