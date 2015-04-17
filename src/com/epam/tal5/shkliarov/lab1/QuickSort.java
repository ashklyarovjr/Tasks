package com.epam.tal5.shkliarov.lab1;

/**
 * Created by Anton_Shkliarov on 4/17/2015.
 */
public class QuickSort {
    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static void quicksort(int list[], int from, int to) {
        if (from >= to) {
            return;
        }
        int pivot = list[from];
        int i = from - 1;
        int j = to + 1;
        while (i < j) {
            i++;
            while (list[i] < pivot) {
                i++;
            }
            j--;
            while (list[j] > pivot) {
                j--;
            }
            if (i < j) {
                swap(list, i, j);
            }
        }
        quicksort(list, from, j);
        quicksort(list, j + 1, to);
    }

    public static int[] quicksort(int[] list) {
        long start = System.currentTimeMillis();
        quicksort(list, 0, list.length - 1);
        long finish = System.currentTimeMillis() - start;
        System.out.println("QuickSort is: " + finish + " ms");
        return list;
    }
}
