package org.example;

import java.io.PrintStream;
import java.util.Scanner;

public class AverageCalculator {
    static void main() {


        Scanner in = new Scanner(System.in);
        System.out.println("ВВедите число");
        int a ,b , c, d, e;
        System.out.println("a =");
        a = in.nextInt();
        System.out.println("b =");
        b = in.nextInt();
        System.out.println("c =");
        c = in.nextInt();
        System.out.println("d =");
        d = in.nextInt();
        System.out.println("e =");
        e = in.nextInt();
        System.out.println("Соеднне =" + (a + b + c + d + e) /5);
        double avg = (a + b + c + d + e) /5.0;
        System.out.printf("Среднее: %.2f%n", avg);



    }

    }

