package com.example;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int divide(int a, int b) {
       if (b == 0) {
           throw new IllegalArgumentException("Division by zero");
       } else  {
           return a / b;
       }
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max && arr != null) {
                max = arr[i];
            }
        }
       return max;
    }
}
