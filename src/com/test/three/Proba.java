package com.test.three;
import java.util.Scanner;

public class Proba {
    public void recurse(int n) {
        if (n <= 1) return;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                recurse(n / i);
                break;
            }
        }
    }
    public static void main(String[] args) {
        int number = 0;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите число :");
            number = Integer.parseInt(sc.next());
        } catch (NumberFormatException e) {
            System.out.println("Введите правильное число!");
        }

        Proba proba = new Proba();
        if(Math.floor(number) == number){
            proba.recurse(number);
        }
    }
}
