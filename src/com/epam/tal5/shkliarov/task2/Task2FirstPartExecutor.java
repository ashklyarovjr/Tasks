package com.epam.tal5.shkliarov.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task2FirstPartExecutor {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter n");
        int n = Integer.parseInt(reader.readLine());

        int[] numbersArray = Task2Methods.fullLinearArrayInit(n);
        /*int[] quantitiesArray = Task2Methods.lengthsCounter(numbersArray);
        Task2Methods.longestAndShortestNumber(numbersArray, quantitiesArray);

        Task2Methods.lengthSortAsc(numbersArray, quantitiesArray);

        Task2Methods.lengthSortDesc(numbersArray, quantitiesArray);

        Task2Methods.greaterThanAvgLength(numbersArray, quantitiesArray);

        Task2Methods.lessThanAvgLength(numbersArray, quantitiesArray);

        Task2Methods.numsWithLesserCountOfUniqueElems(numbersArray);

        System.out.println(Task2Methods.firstOnlyIncreasingElemsNumberSearch(numbersArray));

        System.out.println(Task2Methods.firstOnlyDifferentElemsNumberSearch(numbersArray));

        System.out.println(Task2Methods.firstNumberHasEqualOddAndEvenSearch(numbersArray));*/

        int[][] matrix = Task2Methods.matrixRandomInit(5);

        Task2Methods.matrixPrint(matrix);
        System.out.println();

        /*Task2Methods.matrixSortByRows(matrix);
        Task2Methods.matrixPrint(matrix);
        System.out.println();

        Task2Methods.matrixSortByCols(matrix);
        Task2Methods.matrixPrint(matrix);
        System.out.println();

        System.out.println(Arrays.toString(numbersArray));
        Task2Methods.matrixPrint(Task2Methods.fromArrayToMatrix(numbersArray));
        System.out.println();

        matrix = Task2Methods.cycleRightMove(3, matrix);
        Task2Methods.matrixPrint(matrix);
        System.out.println();

        matrix = Task2Methods.cycleLeftMove(3, matrix);
        Task2Methods.matrixPrint(matrix);
        System.out.println();

        matrix = Task2Methods.cycleUpMove(3, matrix);
        Task2Methods.matrixPrint(matrix);
        System.out.println();

        matrix = Task2Methods.cycleDownMove(3, matrix);
        Task2Methods.matrixPrint(matrix);
        System.out.println();

        Task2Methods.sumBetweenFirstAndSecondPositiveElementsInARow(matrix);*/

        /*Task2Methods.someDegreesAntiClockwiseTurn(matrix, 1);
        Task2Methods.matrixPrint(matrix);*/

        int[][] matrix_second = Task2Methods.matrixConsoleInit();
        Task2Methods.matrixPrint(matrix_second);
        System.out.println();
        matrix_second = Task2Methods.compressMatrix(matrix_second);
        Task2Methods.matrixPrint(matrix_second);

        System.out.println(Arrays.toString(Task2Methods.matrixToArray(matrix)));
        //Task2Methods.findAndPrintIncreasingLines(matrix);

        int[][] matrix_third = Task2Methods.matrixConsoleInit();
        Task2Methods.matrixPrint(matrix_third);
        matrix_third = Task2Methods.nullsToTheEndOfEachRowInMatrix(matrix_third);
        Task2Methods.matrixPrint(matrix_third);
    }
}
