package org.example.week01;

import java.util.Scanner;

public class PasswordValidator {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите пароль: ");
        String password = in.nextLine();

        boolean hasLength = password.length() >= 8;
        boolean hasLower = password.matches(".*[a-z].*");
        boolean hasUpper = password.matches(".*[A-Z].*");
        boolean hasDigit = password.matches(".*[0-9].*");
        boolean hasSpecial = password.matches(".*[!@#$%^&*()].*");

        boolean isValid = hasLength && hasLower && hasUpper && hasDigit && hasSpecial;
        System.out.println(isValid ? "Пароль валидный" : "Пароль НЕ валидный");

        System.out.println("Длина >= 8: " + hasLength);
        System.out.println("Строчная буква: " + hasLower);
        System.out.println("Заглавная буква: " + hasUpper);
        System.out.println("Цифра: " + hasDigit);
        System.out.println("Спецсимвол: " + hasSpecial);



        System.out.println("Введите пароль: ");
        String password1 = in.nextLine();
        if (password.length() >= 8
                && password.matches(".*[a-z].*")
                && password.matches(".*[A-Z].*")
                && password.matches(".*[0-9].*")
                && password.matches(".*[!@#$%^&*()].*")){
            System.out.println("Пароль валидный");
        }else {
            System.out.println("Пароль НЕ валидный");
        }
        if (password.length() >= 8) {
            System.out.println("Длинна = true");
        } else  {System.out.println("Длинна = felse");}
        if (password.matches(".*[a-z].*")) {
            System.out.println("нижний регистр = true");
        } else  {System.out.println("нижний регистр = felse");}
        if (password.matches(".*[A-Z].*")) {
            System.out.println("верхний регистр = true");
        } else  {System.out.println("верхний регистр = felse");}
        if (password.matches(".*[0-9].*")) {
            System.out.println("цифра = true");
        } else  {System.out.println("цифра = felse");}
        if (password.matches(".*[!@#$%^&*()].*")) {
            System.out.println("спецсимвол = true");
        } else  {System.out.println("спецсимвол = felse");}




    }

}
