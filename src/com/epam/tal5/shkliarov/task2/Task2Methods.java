package com.epam.tal5.shkliarov.task2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task2Methods {
//--------------------------------------------------------------1 part--------------------------------------------------

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

    public static int countOfUniqueNums(int number) {
        int outerCounter = 0;
        int innerCounter;
        String numberString = Integer.toString(number);
        for (int i = 0; i < numberString.length(); i++) {
            char element = numberString.charAt(i);
            innerCounter = 0;
            for (int j = 0; j < numberString.length(); j++) {
                if (element == numberString.charAt(j)) {
                    ++innerCounter;
                }
            }
            if (innerCounter == 1) {
                ++outerCounter;
            } else {
                outerCounter = 0;
            }
        }
        return outerCounter;
    }

    public static int[] numsWithLesserCountOfUniqueElems(int[] numbersArray) {
        int[] uniqueElemQuants = new int[numbersArray.length];
        for (int i = 0; i < numbersArray.length; i++) {
            uniqueElemQuants[i] = countOfUniqueNums(numbersArray[i]);
        }
        return uniqueElemQuants;
    }

    public static boolean onlyincreasingElemsNumber(int number) {
        String stringNumber = Integer.toString(number);
        char[] numberCharArr = stringNumber.toCharArray();
        for (int i = 1; i < numberCharArr.length; i++) {
            if (numberCharArr[i] - numberCharArr[i - 1] == 1) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public static String firstOnlyIncreasingElemsNumberSearch(int[] numberArray) {
        int index = 0;
        int number = 0;
        for (int i = 0; i < numberArray.length; i++) {
            if (onlyincreasingElemsNumber(numberArray[i])) {
                index = i;
                number = numberArray[i];
                break;
            }
        }
        return index + " " + number + "\n";
    }

    public static boolean onlyDifferentElemsNumber(int number) {
        String stringNumber = Integer.toString(number);
        char[] numberCharArr = stringNumber.toCharArray();
        Arrays.sort(numberCharArr);
        for (int i = 1; i < numberCharArr.length; i++) {
            if (numberCharArr[i - 1] != numberCharArr[i])
                continue;
            else
                return false;
        }
        return true;
    }

    public static String firstOnlyDifferentElemsNumberSearch(int[] numberArray) {
        int index = 0;
        int number = 0;
        for (int i = 0; i < numberArray.length; i++) {
            if (onlyDifferentElemsNumber(numberArray[i])) {
                index = i;
                number = numberArray[i];
                break;
            }
        }
        return index + " " + number + "\n";
    }

    public static boolean evenOrOddNum(int number) {
        return number % 2 == 0;
    }

    public static boolean numberHasEqualOddAndEven(int number) {
        int[] counter = new int[2];
        String stringNumber = Integer.toString(number);
        char[] numberCharArr = stringNumber.toCharArray();
        for (char aNumberCharArr : numberCharArr) {
            if (evenOrOddNum(aNumberCharArr))
                counter[0]++;
            else
                counter[1]++;
        }
        return counter[0] == counter[1];
    }

    public static String firstNumberHasEqualOddAndEvenSearch(int[] numberArray) {
        int index = 0;
        int number = 0;
        for (int i = 0; i < numberArray.length; i++) {
            if (evenOrOddNum(numberArray[i])) {
                if ((numberHasEqualOddAndEven(numberArray[i]))) {
                    index = i;
                    number = numberArray[i];
                    break;
                }
            }
        }
        if (index == 0 && number == 0) {
            return "There's no even number with equal quantity of odd and even elements";
        } else
            return index + " " + number + "\n";
    }

//------------------------------------------2 part ---------------------------------------------------------------------

    public static int[][] matrixRandomInit(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * (2 * size + 1)) - size;
            }
        }
        return matrix;
    }

    public static int[][] matrixEmptyInit(int size) {
        return new int[size][size];
    }

    public static int[][] matrixConsoleInit() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of matrix: ");
        int size = Integer.parseInt(reader.readLine());
        int[][] matrix = new int[size][size];
        System.out.println("Now fill in the matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = Integer.parseInt(reader.readLine());
            }
        }
        return matrix;
    }

    public static void matrixSortByRows(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                for (int k = j + 1; k < matrix[i].length; k++) {
                    if (matrix[i][j] > matrix[i][k]) {
                        int temp = matrix[i][k];
                        matrix[i][k] = matrix[i][j];
                        matrix[i][j] = temp;
                    }
                }
            }
        }
    }

    public static int matrixSizeDetector(int[] array) {
        int size = 0;
        for (int i = 1; i <= array.length; ++i) {
            if (array.length <= i * i) {
                size = i;
                break;
            }
        }
        return size;
    }

    public static void matrixSortByCols(int[][] matrix) {
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                for (int k = 0; k < matrix[i].length; k++) {
                    if (matrix[i][k] > matrix[j][k]) {
                        int temp = matrix[j][k];
                        matrix[j][k] = matrix[i][k];
                        matrix[i][k] = temp;
                    }
                }
            }
        }
    }

    public static int[][] fromArrayToMatrix(int[] array) {
        int size = matrixSizeDetector(array);
        int k = 0;
        int[][] matrix = new int[size][size];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (array.length > k)
                    matrix[i][j] = array[k];
                k++;
            }
        }
        return matrix;
    }

    public static int[][] cycleRightMove(int step, int[][] matrix) {
        int size = matrix[0].length;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < step; j++) {
                int temp = matrix[i][size - 1];
                for (int k = size - 1; k > 0; k--) {
                    matrix[i][k] = matrix[i][k - 1];
                }
                matrix[i][0] = temp;
            }
        }
        return matrix;
    }

    public static int[][] cycleLeftMove(int step, int[][] matrix) {
        int size = matrix[0].length;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < step; j++) {
                int temp = matrix[i][0];
                for (int k = 0; k < size - 1; k++) {
                    matrix[i][k] = matrix[i][k + 1];
                }
                matrix[i][size - 1] = temp;
            }
        }
        return matrix;
    }

    public static int[][] cycleUpMove(int step, int[][] matrix) {
        int size = matrix.length;
        for (int i = 0; i < step; i++) {
            int[] temp = matrix[0];
            for (int j = 0; j < size - 1; j++) {
                matrix[j] = matrix[j + 1];
            }
            matrix[size - 1] = temp;
        }
        return matrix;
    }

    public static int[][] cycleDownMove(int step, int[][] matrix) {
        int size = matrix.length;
        for (int i = 0; i < step; i++) {
            int[] temp = matrix[size - 1];
            for (int j = size - 1; j > 0; j--) {
                matrix[j] = matrix[j - 1];
            }
            matrix[0] = temp;
        }
        return matrix;
    }

    public static int firstPositiveElementInARowIndexSearch(int[] row) {
        int index = 0;
        for (int i = 0; i < row.length; i++) {
            if (row[i] > 0) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static int secondPositiveElementInARowIndexSearch(int[] row) {
        int index = 0;
        for (int i = firstPositiveElementInARowIndexSearch(row) + 1; i < row.length; i++) {
            if (row[i] > 0) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static void sumBetweenFirstAndSecondPositiveElementsInARow(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            int first = firstPositiveElementInARowIndexSearch(matrix[i]);
            int second = secondPositiveElementInARowIndexSearch(matrix[i]);
            if ((second - first) > 1) {
                for (int j = first + 1; j < second; j++) {
                    sum += sum + matrix[i][j];
                }
            }
            System.out.println(i + " " + sum);
            sum = 0;
        }
    }

    public static void someDegreesAntiClockwiseTurn(int[][] matrix, int k) {
        for (int e = 0; e < k; e++) {
            for (int i = 0; i < matrix.length / 2; i++) {
                for (int j = i; j < matrix.length - 1 - j; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][matrix.length - 1 - i];
                    matrix[j][matrix.length - 1 - i] = matrix[matrix.length - 1 - i][matrix.length - 1 - j];
                    matrix[matrix.length - 1 - i][matrix.length - 1 - j] = matrix[matrix.length - 1 - j][i];
                    matrix[matrix.length - 1 - j][i] = temp;
                }
            }
        }
    }

    public static int[] matrixToArray(int[][] matrix) {
        int[] array = new int[matrix.length * matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                array[i * matrix.length + j] = matrix[i][j];
            }
        }
        return array;
    }

    //TODO Finish This!!
    public static void findAndPrintIncreasingLines(int[][] matrix) {
        int min = Integer.MIN_VALUE;
        int[] array = matrixToArray(matrix);
        int fromIndex = 0;
        int toIndex = 0;
        int counter = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] - array[i] == 1) {

            } else {
                System.out.print("*");
            }
        }
    }

    public static int matrixArithmeticAverage(int[][] matrix) {
        int arithmeticAverage = 0;
        for (int[] aMatrix : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                arithmeticAverage += aMatrix[j];
            }
        }
        return arithmeticAverage / (matrix.length * matrix.length);
    }

    public static int[][] matrixMinusArithmeticAverage(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] -= matrixArithmeticAverage(matrix);
            }
        }
        return matrix;
    }

    public static int[][] nullsToTheEndOfEachRowInMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 0) {
                    for (int k = matrix.length - 1; k > j; k--) {
                        if (matrix[i][k] != 0) {
                            int temp = matrix[i][k];
                            matrix[i][k] = matrix[i][j];
                            matrix[i][j] = temp;
                        }
                    }
                }
            }
        }
        return matrix;
    }

    public static int[][] compressMatrix(int[][] matrix) {
        int newMatrixRows = matrix.length;
        int newMatrixCols = matrix.length;
        int counter = 0;
        int colIndex = 0;
        int rowIndex = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[j][i] == 0) {
                    counter++;
                    colIndex = i;
                }
            }
            if (counter == matrix.length) {
                newMatrixCols--;
                counter = 0;
            } else {
                counter = 0;
            }
        }
        counter = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    counter++;
                    rowIndex = i;
                }
            }
            if (counter == matrix.length) {
                newMatrixRows--;
                counter = 0;
            } else {
                counter = 0;

            }
        }
        if (newMatrixCols != matrix.length) {
            matrix = cycleRightMove(matrix.length - 1 - colIndex, matrix);
        }
        if (newMatrixRows != matrix.length) {
            matrix = cycleDownMove(matrix.length - 1 - rowIndex, matrix);
        }
        int[][] newMatrix = new int[newMatrixRows][newMatrixCols];
        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix[i].length; j++) {
                newMatrix[i][j] = matrix[i][j];
            }
        }
        return newMatrix;
    }

    public static void matrixPrint(int[][] matrix) {
        for (int[] aMatrix : matrix) {
            System.out.println("\n");
            for (int anAMatrix : aMatrix) {
                System.out.print(anAMatrix + " ");
            }
        }
    }
}