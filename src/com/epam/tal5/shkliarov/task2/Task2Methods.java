package com.epam.tal5.shkliarov.task2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2Methods {

    public static int[] fullLinearArrayInit(int n) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        return array;
    }

    public static int[] emptyLinearArrayInit(int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
        return array;
    }


    public static int[] bubbleSort(int[] array) {
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

    public static void lengthSortDesc(int[] numbersArray, int[] quantitiesArray) {
        int t = 0;
        int k = 0;
        for (int i = 0; i < quantitiesArray.length - 1; i++) {
            for (int j = i + 1; j < quantitiesArray.length; j++) {
                if (quantitiesArray[i] < quantitiesArray[j]) {
                    t = quantitiesArray[i];
                    k = numbersArray[i];
                    quantitiesArray[i] = quantitiesArray[j];
                    numbersArray[i] = numbersArray[j];
                    quantitiesArray[j] = t;
                    numbersArray[j] = k;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < quantitiesArray.length; i++) {
            System.out.println(quantitiesArray[i] + " " + numbersArray[i]);
        }
    }

    public static void lengthSortAsc(int[] numbersArray, int[] quantitiesArray) {
        int t = 0;
        int k = 0;
        for (int i = 0; i < quantitiesArray.length - 1; i++) {
            for (int j = i + 1; j < quantitiesArray.length; j++) {
                if (quantitiesArray[i] > quantitiesArray[j]) {
                    t = quantitiesArray[i];
                    k = numbersArray[i];
                    quantitiesArray[i] = quantitiesArray[j];
                    numbersArray[i] = numbersArray[j];
                    quantitiesArray[j] = t;
                    numbersArray[j] = k;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < quantitiesArray.length; i++) {
            System.out.println(quantitiesArray[i] + " " + numbersArray[i]);
        }
    }


    public static int[] lengthsCounter(int[] numbers) {
        int[] quantitiesArray = emptyLinearArrayInit(numbers.length);
        for (int i = 0; i < numbers.length; i++) {
            for (double j = (double) numbers[i]; j >= 1 || j <= -1; j /= 10) {
                ++quantitiesArray[i];
            }
        }
        return quantitiesArray;
    }

    public static void longestAndShortestNumber(int[] numbersArray, int[] quantitiesArray) throws IOException {
        int longestNum = numbersArray[0];
        int shortestNum = numbersArray[0];
        int shortest = quantitiesArray[0];
        int longest = quantitiesArray[0];

        for (int i = 0; i < quantitiesArray.length; i++) {
            if (shortest > quantitiesArray[i]) {
                shortestNum = numbersArray[i];
                shortest = quantitiesArray[i];
            }
            else if (longest < quantitiesArray[i]) {
                longestNum = numbersArray[i];
                longest = quantitiesArray[i];
            }
        }
        System.out.println(shortestNum + " " + shortest);
        System.out.println(longestNum + " " + longest);
    }
}