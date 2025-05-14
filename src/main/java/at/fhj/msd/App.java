package at.fhj.msd;

import java.util.Arrays;
import java.util.Random;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        //Generate integer numbers
        Random rnd = new Random();
        //Integer[] numbers = new Integer[10];
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rnd.nextInt(100);
        }

        //Generate Double numbers
        double[] numbers2 = new double[10];

        for (int i = 0; i < numbers2.length; i++) {

            double number = rnd.nextDouble(100.0);
            double roundedNumber = Math.round(number * 100.0) / 100.0;
            numbers2[i] = roundedNumber;
        }

        System.out.println("Before:");
        printArray(numbers);
        printArrayDouble(numbers2);

        System.out.println("After:");
        selection_sort(numbers);
        selection_sort2(numbers2);

        printArray(numbers);
        printArrayDouble(numbers2);
    }

    public static void printArray(int[] array) {

        System.out.println(Arrays.toString(array));

    }

    public static void printArrayDouble(double[] array) {

        System.out.println(Arrays.toString(array));

    }

    public static void selection_sort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {  //No need to iterate full length, since only length-1 is needed. This will automattically check if last element is on the right place! 

            int min = array[i];
            int indexOfMin = i;

            for (int j = i + 1; j < array.length; j++) {

                if (array[j] < min) {
                    min = array[j];
                    indexOfMin = j;
                }

            }

            swap(array, i, indexOfMin);

        }

    }

    public static void selection_sort2(double[] array) {

        for (int i = 0; i < array.length - 1; i++) {  //No need to iterate full length, since only length-1 is needed. This will automattically check if last element is on the right place! 

            double min = array[i];
            int indexOfMin = i;

            for (int j = i + 1; j < array.length; j++) {

                if (array[j] < min) {
                    min = array[j];
                    indexOfMin = j;
                }

            }

            swap(array, i, indexOfMin);

        }

    }

    public static void swap(int[] array, int i, int indexOfMin) {

        int temp = array[i];
        array[i] = array[indexOfMin];
        array[indexOfMin] = temp;

    }

    public static void swap(double[] array, int i, int indexOfMin) {

        double temp = array[i];
        array[i] = array[indexOfMin];
        array[indexOfMin] = temp;

    }

}
