package com.epam.tal5.shkliarov.task2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task2Methods {

    public static void maxArrayElemWithPair(int[] arrayQuant, int[] arrayPair) {
        int maxQuant = arrayQuant[0];
        int maxPair = 0;
        for (int i = 0; i < arrayQuant.length; i++) {
            if (maxQuant < arrayQuant[i]) {
                maxQuant = arrayQuant[i];
                maxPair = arrayPair[i];
            }
        }
        System.out.println(maxQuant + " " + maxPair);
    }

    public static void minArrayElemWithPair(int[] arrayQuant, int[] arrayPair) {
        int minQuant = arrayQuant[0];
        int minPair = 0;
        for (int i = 0; i < arrayQuant.length; i++) {
            if (minQuant < arrayQuant[i]) {
                minQuant = arrayQuant[i];
                minPair = arrayPair[i];
            }
        }
        System.out.println(minQuant + " " + minPair);
    }

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
        int t;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                }
            }
        }
        return array;
    }

    public static void lengthSortDesc(int[] numbersArray, int[] quantitiesArray) {
        int t;
        int k;
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
        int t;
        int k;
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

    public static int elementLengthCounter(int element) {
        int length = 0;
        for (double j = (double) element; j >= 1 || j <= -1; j /= 10) {
            ++length;
        }
        return length;
    }

    public static int avgLengthCounter(int[] quantities) {
        int avgLength = 0;
        for (int quantity : quantities) {
            avgLength += quantity;
        }
        avgLength = avgLength / quantities.length;
        return avgLength;
    }

    public static void greaterThanAvgLength(int[] numbersArray, int[] quantitiesArray) {
        int avgLen = avgLengthCounter(quantitiesArray);
        System.out.println();
        for (int i = 0; i < quantitiesArray.length; i++) {
            if (quantitiesArray[i] > avgLen) {
                System.out.println(quantitiesArray[i] + " " + numbersArray[i]);

            }
        }
    }

    public static void lessThanAvgLength(int[] numbersArray, int[] quantitiesArray) {
        int avgLen = avgLengthCounter(quantitiesArray);
        System.out.println();
        for (int i = 0; i < quantitiesArray.length; i++) {
            if (quantitiesArray[i] < avgLen) {
                System.out.println(quantitiesArray[i] + " " + numbersArray[i]);

            }
        }
    }

    public static void longestAndShortestNumber(int[] numbersArray, int[] quantitiesArray) {
        int longestNum = numbersArray[0];
        int shortestNum = numbersArray[0];
        int shortest = quantitiesArray[0];
        int longest = quantitiesArray[0];

        for (int i = 0; i < quantitiesArray.length; i++) {
            if (shortest > quantitiesArray[i]) {
                shortestNum = numbersArray[i];
                shortest = quantitiesArray[i];
            } else if (longest < quantitiesArray[i]) {
                longestNum = numbersArray[i];
                longest = quantitiesArray[i];
            }
        }
        System.out.println(shortestNum + " " + shortest);
        System.out.println(longestNum + " " + longest);
    }

    public static int countOfSimilarNums(int number) {
        int outerCounter = 0;
        String numberString = Integer.toString(number);
        char[] numberCharArr = numberString.toCharArray();
        int index = 0;
        Arrays.sort(numberCharArr);
        if (numberCharArr.length >= 2) {
            for (int i = 1; i < numberCharArr.length; i++) {
                for (int j = i - 1; j < i; j++) {
                    index = i + j;
                    if (numberCharArr[j] == numberCharArr[i]) {
                        outerCounter++;
                    } else {
                        i = index;
                    }
                }
            }
            return outerCounter;
        } else {
            return 1;
        }
    }
    public static void numsWithLesserCountOfUniqueElems(int[] numbersArray) {
        int[] uniqueElemQuants = new int[numbersArray.length];
        for (int i = 0; i < numbersArray.length; i++) {
            uniqueElemQuants[i] =lengthsCounter(numbersArray)[i] - countOfSimilarNums(numbersArray[i]);
        }
        System.out.println("uniqueElemQuants");
        System.out.println(Arrays.toString(uniqueElemQuants));
    }
}