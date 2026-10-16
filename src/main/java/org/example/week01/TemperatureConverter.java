package org.example.week01;

import java.util.Scanner;

public class TemperatureConverter {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try{
            System.out.println("Введите температуру в градусах цельсия :");
            double cel = in.nextDouble();
            System.out.println("Температура в градусах Фаренгейта : " + (cel * 9.0 / 5.0 + 32) + "F");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
