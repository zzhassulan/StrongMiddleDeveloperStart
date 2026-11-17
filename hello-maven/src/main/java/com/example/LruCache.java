package com.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class LruCache<Key, V> extends LinkedHashMap<Key,V> {
    private final int capacity;

    public LruCache(int capacity) {
        super(16, 0.75F, false);
        this.capacity = capacity;
    }

    @Override
    public boolean removeEldestEntry(Map.Entry<Key, V> eldest) {
        return size() > capacity;
    }
}
