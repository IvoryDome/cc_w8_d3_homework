package com.android.ryan.starcraftmaps;

import java.io.Serializable;
import java.util.ArrayList;

public class Map implements Serializable{

    private String name;

    public Map(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
