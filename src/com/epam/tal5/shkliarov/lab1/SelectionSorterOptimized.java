package com.epam.tal5.shkliarov.lab1;


//Lab 1 Task 4

public class SelectionSorterOptimized {
    public static void sort(int[] arr) {
        long start = System.currentTimeMillis();
        for (int barrier = 0; barrier < arr.length - 1; barrier++) {
            int minIndex = barrier;
            for (int index = barrier + 1; index < arr.length; index++) {
                if (arr[index] < arr[minIndex])
                    minIndex = index;
                if (minIndex != barrier) {
                    int tmp = arr[barrier];
                    arr[barrier] = arr[minIndex];
                    arr[minIndex] = tmp;
                }
            }
        }
        long finish = System.currentTimeMillis() - start;
        System.out.println("SelectionSort time is: " + finish + " ms");
    }
}
