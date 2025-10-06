package com.example.task10;

public class Task10Main {
    public static void main(String[] args) {

        int[] arr = {7, 5, 9};
        System.out.println(numMin(arr));

    }

    static int numMin(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Массив не может быть пустым");
        }

        int minIndex = 0;
        int minValue = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= minValue) {
                minValue = arr[i];
                minIndex = i;
            }
        }

        return minIndex;
    }

}