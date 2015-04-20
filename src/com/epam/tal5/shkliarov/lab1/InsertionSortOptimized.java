package com.epam.tal5.shkliarov.lab1;

import java.util.Arrays;

/**
 * Created by Anton_Shkliarov on 4/17/2015.
 */
public class InsertionSortOptimized {
    public static void insertionSort(int[] arr) {
        long start = System.currentTimeMillis();
        for (int i = 1; i < arr.length; i++) {
            int newElement = arr[i];
            int newPos = Arrays.binarySearch(arr, 0, i, newElement);

            if (newPos < 0)
                newPos = -newPos - 1;

            int lng = i - newPos;
            if (lng > 0) {
                System.arraycopy(arr, newPos, arr, newPos + 1, lng);
            }
            arr[newPos] = newElement;
        }
        long finish = System.currentTimeMillis() - start;
        System.out.println("Insertion time is: " + finish + " ms");
    }
}
