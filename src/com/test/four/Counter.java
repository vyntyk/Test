package com.test.four;

import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String strUserResponse = sc.nextLine();
        int numVowels = 0;
            System.out.print("Vowels:");

            for (int i = 0; i < strUserResponse.length(); i++) {
                char v = strUserResponse.charAt(i);
                if (v == 'а' || v == 'о' || v == 'у' || v == 'и' || v == 'ы'
                        || v == 'е' || v == 'ё' ||v == 'я'|| v == 'А' || v == 'О' || v == 'У' ||v == 'И'
                        || v == 'Ы'||v == 'Е' || v == 'Ё'||v == 'Я') {
                    //System.out.print(" " + v);
                    numVowels++;
                }
            }
            System.out.print("Number of vowels: " + numVowels);
        }
    }

