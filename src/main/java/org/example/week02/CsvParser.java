package org.example.week02;

public class CsvParser {
    static void main(String[] args) {
        String csv = "Иванов;4;5;3;5;4";
        String[] parts = csv.split(";");
        double avg = 0;

        for (String part : parts) {

            avg = Integer.parseInt(parts[1]);
            System.out.println(part);
        }
        System.out.println(parts[0] + " " + avg);
        String str = parts[0];
        Boolean str1 = str.equals(parts[0]);
        System.out.println(str1);
        }
    }

