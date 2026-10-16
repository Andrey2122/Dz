package org.example.week01;

import java.util.Scanner;

public class SumOfNumbers {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число N: ");
        int n = in.nextInt();
        System.out.println(n);
        int sum = 0;
        for (int i = 1; i <= n ; i++){
            sum += i;
            System.out.println(sum);
        }
    }
}
