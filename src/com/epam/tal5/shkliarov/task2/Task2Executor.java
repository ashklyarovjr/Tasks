package com.epam.tal5.shkliarov.task2;
import com.epam.tal5.shkliarov.task2.Task2Methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task2Executor {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter n");
        int n = Integer.parseInt(reader.readLine());

        int[] numbersArray = Task2Methods.fullLinearArrayInit(n);
        int[] quantitiesArray = Task2Methods.lengthsCounter(numbersArray);
        Task2Methods.longestAndShortestNumber(numbersArray, quantitiesArray);
        Task2Methods.lengthSortAsc(numbersArray, quantitiesArray);
        Task2Methods.lengthSortDesc(numbersArray, quantitiesArray);
        Task2Methods.greaterThanAvgLength(numbersArray, quantitiesArray);
        Task2Methods.lessThanAvgLength(numbersArray, quantitiesArray);
    }
}
