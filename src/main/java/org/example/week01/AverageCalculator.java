package org.example.week01;

import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Введите число");
        int a ,b , c, d, e;
        System.out.println("a =");
        a = in.nextInt();
        System.out.println("b =");
        b = in.nextInt();
        System.out.println("c =");

        System.out.println("c =");
        c = in.nextInt();
        System.out.println("d =");
        d = in.nextInt();
        System.out.println("e =");
        e = in.nextInt();
        int[] arr = {a,b,c,d,e};

        System.out.println("Среднне =" + (a + b + c + d + e) /5);


        double avg = (a + b + c + d + e) /5.0;
        System.out.printf("Среднее: %.2f%n", avg);

        System.out.println("Массив :" + arr);
        }
        class AverageCalculator1 {
            // --- Метод 1: читает 5 чисел и возвращает массив ---
            int[] readNumbers() {
                Scanner in = new Scanner(System.in);
                int[] nums = new int[5];
                for (int i = 0; i < nums.length; i++) {
                    System.out.print("Введите число #" + (i + 1) + ": ");
                    nums[i] = in.nextInt();
                }
                return nums;
            }

            // --- Метод 2: среднее для массива int ---
            double average(int[] nums) {
                int sum = 0;
                for (int num : nums) {
                    sum += num;
                }
                return sum / (double) nums.length;
            }

            // --- Метод 3: перегрузка — среднее для двух double ---
            double average(double a, double b) {
                return (a + b) / 2.0;
            }


        }
}



