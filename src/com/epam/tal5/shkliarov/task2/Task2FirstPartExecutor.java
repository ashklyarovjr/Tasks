package com.epam.tal5.shkliarov.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2FirstPartExecutor {

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

        Task2Methods.numsWithLesserCountOfUniqueElems(numbersArray);

        System.out.println(Task2Methods.firstOnlyIncreasingElemsNumberSearch(numbersArray));

        System.out.println(Task2Methods.firstOnlyDifferentElemsNumberSearch(numbersArray));

        System.out.println(Task2Methods.firstNumberHasEqualOddAndEvenSearch(numbersArray));
    }
}
