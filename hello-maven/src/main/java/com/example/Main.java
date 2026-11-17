package com.example;

public class Main {
    public  static void main(String[] args) {
       LruCache<String, Integer> lruCache = new LruCache<>(2);

       lruCache.put("a", 1);
       lruCache.put("b", 2);
       lruCache.get("a");
       lruCache.put("c", 3);

        System.out.println(lruCache.keySet());


    }
}