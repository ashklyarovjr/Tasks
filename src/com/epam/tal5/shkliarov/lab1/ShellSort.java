package com.epam.tal5.shkliarov.lab1;

/**
 * Created by Anton_Shkliarov on 4/17/2015.
 */
public class ShellSort {
    public static void shellSort(int[] array) {
        int step = array.length / 2;//инициализируем шаг.
        long start = System.currentTimeMillis();
        while (step > 0) {
            for (int i = 0; i < (array.length - step); i++) {
                int j = i;
                while (j >= 0 && array[j] > array[j + step]) {
                    int temp = array[j];
                    array[j] = array[j + step];
                    array[j + step] = temp;
                    j--;
                }
            }
            step = step / 2;
        }
        long finish = System.currentTimeMillis() - start;
        System.out.println("ShellSort is: " + finish + " ms");
    }
}
