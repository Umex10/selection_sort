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
        Integer[] numbers = new Integer[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rnd.nextInt(100);
        }

        //Generate Double numbers
        Double[] numbers2 = new Double[10];

        for (int i = 0; i < numbers2.length; i++) {

            double number = rnd.nextDouble(100.0);
            double roundedNumber = Math.round(number * 100.0) / 100.0;
            numbers2[i] = roundedNumber;
        }

        System.out.println("Before:");
        printArray(numbers);
        printArray(numbers2);

        System.out.println("After:");
        selection_sort(numbers);
        selection_sort(numbers2);

        printArray(numbers);
        printArray(numbers2);
    }

    public static <T> void printArray(T[] array) {

        System.out.println(Arrays.toString(array));

    }

    public static <T extends Number & Comparable<T>> void selection_sort(T[] array) {

        for (int i = 0; i < array.length - 1; i++) {  //No need to iterate full length, since only length-1 is needed. This will automattically check if last element is on the right place! 

            T min = array[i];
            int indexOfMin = i;

            for (int j = i + 1; j < array.length; j++) {

                if (array[j].compareTo(min) < 0) {
                    min = array[j];
                    indexOfMin = j;
                }

            }

            swap(array, i, indexOfMin);

        }

    }

    public static <T extends Number & Comparable<T>> void swap(T[] array, int i, int indexOfMin) {

        T temp = array[i];
        array[i] = array[indexOfMin];
        array[indexOfMin] = temp;

    }

}
