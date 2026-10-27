package org.example.week02;

import java.util.Random;

import static java.lang.Math.random;
import static java.util.Collections.min;

public class ArrayStats {
    public Object readNamber;

    static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100); // от 0 до 99
        }
        for (int num1 : arr) {
            System.out.println(num1);

        }
        int min = arr[0];
        int max = arr[0];
        int sum = 0;
        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        for (int num : arr){
            sum += num;
        }
        double avg = sum / arr.length;
        System.out.println("СРЕДНЕЕ = " + avg);

        System.out.println("МИН = " + min);
        System.out.println("МАХ = " + max);





    }
}
