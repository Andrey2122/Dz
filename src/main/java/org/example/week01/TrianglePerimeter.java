package org.example.week01;

import java.util.Scanner;

public class TrianglePerimeter {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Введите стороны треугольника" + "\na = ");
        double a = in.nextDouble();
        System.out.println("b = ");
        double b = in.nextDouble();
        System.out.println("c = ");
        double c = in.nextDouble();
        double p = a + b + c;

        System.out.println(p);
    }
}
