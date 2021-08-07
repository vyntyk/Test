package com.test.five;

import java.util.Scanner;

public class Five {
    //Scanner scanner = new Scanner(System.in);
    //int number = scanner.nextInt();
   // String s = Integer.toString(number);


    public static void main(String[] args) {
        printOne("*");
        printTwo("*");
        printThree("*");
        printFore("*");
        //printFive("*");
        //printSix("*");
        printSeven("*");
        printEight("*");
        //printNine("*");
        //printNull("*");
    }
    String x = "*";
    private static void printOne(String x) {
        System.out.println(" "+x);
        System.out.println(x+x);
        System.out.println(" "+x);
        System.out.println(" "+x);
        System.out.println(" "+x);
        System.out.println(" "+x);
        System.out.println(x+x+x);
    }
    private static void printTwo(String x) {
        System.out.println(" "+x+x+x+" ");
        System.out.println(""+x+"   "+x+" ");
        System.out.println(""+x+"  "+x+" ");
        System.out.println("  "+x);
        System.out.println(" "+x);
        System.out.println(""+x);
        System.out.println(x+x+x+x+x);
    }
    private static void printThree(String x) {
        System.out.println(" "+x+x+x+" ");
        System.out.println(""+x+"   "+x+" ");
        System.out.println("    "+x+" ");
        System.out.println(" "+x+x+x+"   ");
        System.out.println("    "+x+" ");
        System.out.println(""+x+"   "+x+" ");
        System.out.println(" "+x+x+x+" ");
    }
    private static void printFore(String x) {
        System.out.println("    "+x);
        System.out.println("   "+x+x);
        System.out.println(" "+x+"  "+x);
        System.out.println(x+"   "+x+" ");
        System.out.println(x+x+x+x+x+x+x);
        System.out.println("    "+x);
        System.out.println("    "+x);
    }
    private static void printEight(String x) {
        System.out.println(" "+x+x+x+" ");
        System.out.println(""+x+"   "+x+" ");
        System.out.println(""+x+"   "+x+" ");
        System.out.println(" "+x+x+x+"   ");
        System.out.println(""+x+"   "+x+" ");
        System.out.println(""+x+"   "+x+" ");
        System.out.println(" "+x+x+x+" ");
    }
    private static void printSeven(String x) {
        System.out.println(x+x+x+x+x+" ");
        System.out.println("    "+x);
        System.out.println(""+"   "+x+" ");
        System.out.println("  "+x);
        System.out.println(" "+x);
        System.out.println(""+x);
        System.out.println(x);
    }
}
