package com.epam.tal5.shkliarov.task2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2Methods {

    private int[] fullLinearArrayInit(int n) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        return array;
    }

    private int[] emptyLinearArrayInit(int n) {
        int[] array = new int[n];
        return array;
    }

    public void longestAndShortestNumber() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter n");
        int n = Integer.parseInt(reader.readLine());
        int[] numbersArray = fullLinearArrayInit(n);
        int[] quantitiesArray = emptyLinearArrayInit(n);
        for (int i = 0; i < numbersArray.length; i++) {
            for (double j = (double) numbersArray[i]; j > 0; j /= 10) {
                ++quantitiesArray[i];
            }
        }
        for (int i = 0; i < quantitiesArray.length; i++) {
            System.out.print(quantitiesArray[i] + " ");
        }

    }
}