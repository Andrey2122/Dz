package org.example.week01;

import java.util.Scanner;

public class CurrencyConverter {
    public static final double KURS = 85;

    static void main(String[] args) {Scanner in = new Scanner(System.in);
        System.out.println("Введите сумму в долларах");
        int usd = in.nextInt();

        System.out.println(usd + " долларов = " + usd * KURS + " рублей");
    }

}
