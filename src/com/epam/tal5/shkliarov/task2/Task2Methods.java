package com.epam.tal5.shkliarov.task2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2Methods {

    private static int[] fullLinearArrayInit(int n) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        return array;
    }

    private static int[] emptyLinearArrayInit(int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
        return array;
    }


    private static int[] bubbleSort(int[] array) {
        int t  = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i]  <  array[j])
                {
                    t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                }
            }
        }
        return array;
    }

    public static void longestAndShortestNumber() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter n");
        int n = Integer.parseInt(reader.readLine());
        int longestNum = 0;
        int shortestNum = 0;

        int[] numbersArray = fullLinearArrayInit(n);
        int[] quantitiesArray = emptyLinearArrayInit(n);
        for (int i = 0; i < numbersArray.length; i++) {
            for (double j = (double) numbersArray[i]; j >= 1; j /= 10) {
                ++quantitiesArray[i];
            }
        }
        int shortest = quantitiesArray[0];
        int longest = quantitiesArray[0];
        for (int i = 0; i < quantitiesArray.length - 1; i++) {
            if (shortest > quantitiesArray[i+1]) {
                shortestNum = numbersArray[i];
                shortest = quantitiesArray[i];
            }
            else if (longest < quantitiesArray[i+1]) {
                longestNum = numbersArray[i];
                longest = quantitiesArray[i];
            }
        }

        System.out.println(shortestNum + " " + shortest);
        System.out.println(longestNum + " " + longest);
    }


}