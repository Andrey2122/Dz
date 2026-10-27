package org.example.week02;

import org.example.week01.AverageCalculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // 1. Читаем 5 чисел
        int[] numbers = calc.readNumbers();

        // 2. Вычисляем среднее для массива
        double avgArray = calc.average(numbers);
        System.out.printf("Среднее массива: %.2f%n", avgArray);

        // 3. Проверяем перегрузку — среднее для двух чисел
        double avgTwo = calc.average(10.0, 20.0);
        System.out.printf("Среднее двух чисел (10, 20): %.2f%n", avgTwo);
    }

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

