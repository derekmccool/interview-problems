package com.djm;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 5, 1, 3 };
        System.out.println(Arrays.toString(sortArray(arr)));
    }

    //Bubble Sort
    public static int[] sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int tempInt = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tempInt;
                }
            }
        }
        return arr;
    }
}





