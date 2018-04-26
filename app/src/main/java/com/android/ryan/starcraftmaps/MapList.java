package com.android.ryan.starcraftmaps;

import java.util.ArrayList;

public class MapList{

    private ArrayList<Map> list;

    public MapList() {
        list = new ArrayList<Map>();
        list.add(new Map("Fighting Spirit"));
        list.add(new Map("Circuit Breakers"));
        list.add(new Map("Python"));
        list.add(new Map("Destination"));
        list.add(new Map("Match Point"));
        list.add(new Map("Tau Cross"));
        list.add(new Map("Sniper Ridge"));
        list.add(new Map("Lost Temple"));
        list.add(new Map("Electric Circuit"));
        list.add(new Map("Rush Hour"));
        list.add(new Map("Icarus"));
        list.add(new Map("Colloseum"));
        list.add(new Map("Aztec"));
    }


    public ArrayList<Map> getList() {
        return new ArrayList<Map>(list);
    }


}
