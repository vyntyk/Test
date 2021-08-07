package com.test.one;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку :");
        String a = sc.nextLine();

        int sum = 0;
        for (char c : a.replaceAll("\\D", "").toCharArray()) {
            int digit = c - '0';
            sum += digit;
        }
        System.out.println(sum);
    }
}
