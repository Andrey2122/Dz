package org.example.week01;

public class FizzBuzz {
    static void main(String[] args) {
        int f = 0;
        int fb = 0;
        int b = 0;

        for (int i = 1; i <= 100 ; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " FizzBuzz");
                fb++;
            } else if (i % 5 == 0) {
                System.out.println(i + " Buzz");
                b++;
            } else if (i % 3 == 0 ) {
                System.out.println(i + " Fizz");
                f++;
            }else {
                System.out.println(i + " Ни на что");
            }
        }
        System.out.println("FizzBuzz = " + fb);
        System.out.println("Buzz = " + b);
        System.out.println("Fizz = " + f);
    }
}
