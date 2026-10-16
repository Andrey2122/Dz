package org.example.week01;

import java.util.Scanner;

public class Countdown {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число N: ");
        int n = in.nextInt();
        while (n >= 0){
            System.out.println(n);
            n--;

        }
        System.out.println("Старт");
    }
}
