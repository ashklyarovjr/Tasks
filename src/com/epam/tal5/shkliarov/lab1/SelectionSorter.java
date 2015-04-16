package com.epam.tal5.shkliarov.lab1;


public class SelectionSorter {
    public static void sort(int[] arr) {
        long start = System.currentTimeMillis();
        for (int barrier = 0; barrier < arr.length - 1; barrier++) {
            int bar = arr[barrier];
            for (int index = barrier + 1; index < arr.length; index++) {

                if (arr[barrier] > arr[index]) {

                    int tmp = arr[index];

                    arr[index] = arr[barrier];

                    arr[barrier] = tmp;

                }
            }
        }
        long finish = System.currentTimeMillis() - start;
        System.out.println("SelectionSort time is: " + finish + " ms");

    }


}
