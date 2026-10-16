package org.example.week01;

import java.util.Scanner;

public class TriangleClassifier {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Не треугольник");
            return;
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Не треугольник");
            return;
        }


        if (a == b && b == c) {
            System.out.println("Равносторонний");
        }else if (a == b || b == c || a == c) {
            System.out.println("Равнобедренный");
        }else if (a != b && b != c && a != c) {
            System.out.println("Разносторонний");


        }
    }
}
