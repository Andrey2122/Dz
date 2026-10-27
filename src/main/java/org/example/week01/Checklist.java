package org.example.week01;

import java.util.Scanner;

public class Checklist {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int choice;
        int count = 0;
        String task = "";
        do {
            System.out.println("1. Добавить задачу ");
            System.out.println("2. Показать все задачи");
            System.out.println("3. Выйти");
            System.out.println("ваш выбор");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {

                case 1: {
                    System.out.println("Введите задачу");
                    String task1 = scanner.nextLine();

                    task += "\n" + task1 + (count++);
                    break;}
                case 2: {
                    if (count == 0) {
                        System.out.println("Список пуст");
                    }System.out.println("Задача " + count + " " + task);
                    break;
                }
                case 3:{
                    System.out.println("До свидания");
                    break;
                }

            }
        } while (choice !=3);
    }
}
