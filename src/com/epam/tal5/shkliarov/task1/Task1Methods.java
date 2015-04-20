package com.epam.tal5.shkliarov.task1;


import com.epam.tal5.shkliarov.task2.Task2Methods;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Task1Methods {

    //Task 1
    public static void helloSomeone(String name) {
        System.out.println("Hello, " + name);
    }

    //Task 2
    public static void invertArray(String[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            String temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }

    //Task3
    public static void printNumbersInLines(int quantity) {
        Random rnd = new Random();
        int[] array = new int[quantity];
        for (int i = 0; i < quantity; i++) {
            array[i] = rnd.nextInt();
            System.out.println(array[i]);
        }
        for (int i = 0; i < quantity; i++) {
            System.out.print(array[i] + " ");
        }
    }

    //Task 4
    public static void verifyPassword(String password) {
        System.out.println(password.equals("pass123"));
    }

    //Task 5
    public static void sumsAndMultiplies(String[] array) {
        int[] arrayOfInts = new int[array.length];
        try {
            int mul = 0, sum = 0;
            for (int i = 0; i < array.length; i++) {
                arrayOfInts[i] = Integer.parseInt(array[i]);
                mul *= arrayOfInts[i];
                sum += arrayOfInts[i];
            }
        } catch (NumberFormatException ex) {
            ex.getMessage();
        }
    }

    //Task 6
    public static int[] numbersArrayInit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter required numbers through space:");
        String string = scanner.nextLine();
        String[] stringsArray = string.split(" ");
        int[] array = new int[stringsArray.length];
        try {
            for (int i = 0; i < stringsArray.length; i++) {
                array[i] = Integer.parseInt(stringsArray[i]);
            }
        } catch (NumberFormatException ex) {
            System.out.println("Invalid format");
        }
        return array;
    }

    //Task 6.1
    public static void printOddAndEvenNumbers() {
        int[] array = numbersArrayInit();
        System.out.println("Odd numbers:");
        for (int anArray1 : array) {
            if (!Task2Methods.evenOrOddNum(anArray1))
                System.out.print(anArray1);
        }
        System.out.println("Even numbers:");
        for (int anArray : array) {
            if (Task2Methods.evenOrOddNum(anArray))
                System.out.print(anArray);
        }
    }

    //Task 6.2
    public static void printMaxAndMin() {
        int[] array = numbersArrayInit();
        int min = array[0], max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("min: " + min + ", max: " + max);
    }

    //Task 6.3
    public static void verifyDivisionBySevenAndFive() {
        int[] array = numbersArrayInit();
        System.out.println("Numbers that divide by 7 and 5: ");
        for (int anArray : array) {
            if (anArray % 7 == 0 && anArray % 5 == 0)
                System.out.println(anArray);
        }

    }

    //task 6.4
    public static void verifyDivisionByThreeOrNine() {
        int[] array = numbersArrayInit();
        System.out.println("Numbers that divide by 3 and 9: ");
        for (int anArray : array) {
            if (anArray % 3 == 0 || anArray % 9 == 0)
                System.out.println(anArray);
        }
    }


    //Task 6.5
    public static void displayThreeDigitsNumbersWithDifDigits() {
        int[] array = numbersArrayInit();
        for (int anArray : array) {
            if (numberIsThreeElementsLongWithUniqueDigits(anArray)) {
                System.out.println(anArray);
            }
        }
    }


    public static boolean numberIsThreeElementsLongWithUniqueDigits(int number) {
        int length = 3;
        if (Integer.toString(number).length() != length)
            return false;
        int[] array = getElements(number, length);
        if (array[0] == array[1] || array[0] == array[2] || array[1] == array[2])
            return false;
        return true;
    }


    private static int[] getElements(int number, int length) {
        int[] array = new int[length];
        for (int i = length - 1; i >= 0; i--) {
            array[i] = number % 10;
            number /= 10;
        }
        return array;
    }

    //Task 6.6
    public static void printHappyNumber() {
        int[] array = numbersArrayInit();
        for (int anArray : array) {
            if (isHappyNumber(anArray)) {
                System.out.println(anArray);
            }
        }
    }


    private static boolean isHappyNumber(int number) {
        int sumOfFirstHalf = 0;
        int sumOfSecondHalf = 0;
        int length = Integer.toString(number).length();
        if (length % 2 != 0)
            return false;
        int[] array = getElements(number, length);
        for (int i = 0; i < array.length / 2; i++) {
            sumOfFirstHalf += array[i];
            sumOfSecondHalf += array[array.length - 1 - i];
        }
        return sumOfFirstHalf == sumOfSecondHalf;
    }

    //Task 6.6
    public static void displayElements() {
        int[] array = numbersArrayInit();
        int exp;
        for (int i = 1; i < array.length - 1; i++) {
            exp = (array[i - 1] + array[i + 1]) / 2;
            if (array[i] == exp) {
                System.out.print(array[i] + " ");
            }
        }

    }

}