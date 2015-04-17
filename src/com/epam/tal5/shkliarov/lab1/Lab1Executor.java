package com.epam.tal5.shkliarov.lab1;


import java.util.Arrays;
import java.util.Random;

public class Lab1Executor {
    public static void main(String[] args) {
        Random random = new Random();
        int n = 10;
        int[] fstTester = new int[n];
        int[] sndTester = new int[n];
        int[] thrdTester = new int[n];
        int[] fTester = new int[n];
        int[] fifTester = new int[n];
        for (int i = 0; i < n; i++) {
            sndTester[i] = random.nextInt(100);
            fstTester[i] = random.nextInt(100);
            thrdTester[i] = random.nextInt(100);
            fTester[i] = random.nextInt(100);
            fifTester[i] = random.nextInt(100);
        }
        ArrayInverter.invert(fstTester);
        System.out.print(Arrays.toString(fstTester));
        System.out.println();

        System.out.println(Arrays.toString(Merger.merge(fstTester, sndTester)));

        BubbleSorter.sort(fstTester);
        System.out.println(Arrays.toString(fstTester));
        System.out.println();

        SelectionSorter.sort(sndTester);
        System.out.println(Arrays.toString(sndTester));
        System.out.println();

        InsertionSort.insertionSort(thrdTester);
        System.out.println(Arrays.toString(thrdTester));
        System.out.println();

        ShellSort.shellSort(fTester);
        System.out.println(Arrays.toString(fTester));
        System.out.println();

        QuickSort.quicksort(fifTester);
        System.out.println(Arrays.toString(fifTester));
        System.out.println();

    }
}
