package com.epam.tal5.shkliarov.lab1;

/**
 * Created by Anton_Shkliarov on 4/17/2015.
 */
public class InsertionSort {
    public static void insertionSort(int[] array) {
        long start = System.currentTimeMillis();
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > temp) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = temp;
        }
        long finish = System.currentTimeMillis() - start;
        System.out.println("Insertion time is: " + finish + " ms");
    }
}
