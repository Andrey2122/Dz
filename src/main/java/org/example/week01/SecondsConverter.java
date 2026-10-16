package org.example.week01;

import java.util.Scanner;

public class SecondsConverter {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите секунды: ");
        int total = in.nextInt();
        int hours, minutes, seconds;
        hours   = total / 3600;
        minutes = total % 3600 / 60;
        seconds = total % 60;
        System.out.println(hours + ":" + minutes + ":" +  seconds );
    }
}
