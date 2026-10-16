package org.example.week01;

import java.util.Scanner;

public class HelloWorld {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите сумму в рублях");
        float rub = in.nextInt();
        System.out.println("ведите курс валюты");
        float kurse = in.nextInt();
        float usd = rub / kurse;
        System.out.printf(rub + " рублей = " + usd + " долара");

    }
}
