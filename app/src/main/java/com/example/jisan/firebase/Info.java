package com.example.jisan.firebase;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by Jisan on 3/26/2017.
 */

public class Info {
    String name, id;

    public Info(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<String,Object> tomap(){
        HashMap<String,Object> result=new HashMap<>();
        result.put("id",id);
        result.put("name",name);
        return result;
    }
}
