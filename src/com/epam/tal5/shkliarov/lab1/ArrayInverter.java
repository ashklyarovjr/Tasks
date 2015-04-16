package com.epam.tal5.shkliarov.lab1;


public class ArrayInverter {
    public static void invert(int[] arr) {
        long start = System.currentTimeMillis();
        for (int k = arr.length / 2 - 1; k >= 0; k--) {
            int tmp = arr[k];
            arr[k] = arr[arr.length - 1 - k];
            arr[arr.length - 1 - k] = tmp;
        }
        long finish = System.currentTimeMillis() - start;
        System.out.println("ArrayInverter time is: " + finish + " ms");
    }
}
