package com.test.three;
import java.util.ArrayList;
import java.util.Scanner;

public class Three {

    public static void main(String[] args) {

        int number = 0;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите число :");
            number = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Введите правильное число!");
        }
        if(Math.floor(number) == number){
            findPrimeFactors(number);
        }
    }
    private static void findPrimeFactors(int i) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int n = 2; n <= i; n++) {
            while (i % n == 0) {
                list.add(n);
                i /= n;
            }
        }
        for (int n : list) {
            System.out.println(n);
        }
    }
}
