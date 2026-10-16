package org.example.week01;

import java.util.Scanner;

public class RectangleArea {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите стороны прямоугольника \na = ");
        int a = in.nextInt();
        System.out.println("b = ");
        int b = in.nextInt();
        int P = 2 * (a + b);
        int S = a * b;
        System.out.println("P = "+ P + "\nS = " + S);
    }
}
