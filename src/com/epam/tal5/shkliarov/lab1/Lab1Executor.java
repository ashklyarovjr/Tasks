package com.epam.tal5.shkliarov.lab1;


import java.util.Arrays;
import java.util.Random;

public class Lab1Executor {
    public static void main(String[] args) {
        Random random = new Random();
        int[] fstTester = new int[10000];
        int[] sndTester = new int[10000];
        for (int i = 0; i < 10000; i++) {
            sndTester[i] = random.nextInt(100);
            fstTester[i] = random.nextInt(100);
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




    }
}
