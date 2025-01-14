package com.example.DesignPattern.ProotypeAndRegistry;

import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry {

    private Map<String,Vehicle> reg= new HashMap<>();

    public void addPrototype(String key,Vehicle vehicle){
        reg.put(key,vehicle);
    }

    public Vehicle getPrototypes(String key){
        if (!reg.containsKey(key)) {
            throw new IllegalArgumentException("Prototype not found for key: " + key);
        }
        return reg.get(key).clone();
    }
}
