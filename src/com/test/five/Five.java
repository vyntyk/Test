package com.test.five;

import java.util.Scanner;

public class Five {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        String s = Integer.toString(number);
        switch (number){
            case 1: printOne("*");
             break;
            case 2: printTwo("*");
                break;
            case 3: printThree("*");
                break;
            case 4: printFore("*");
                break;
            case 5: printFive("*");
                break;
            case 6: printSix("*");
                break;
            case 7: printSeven("*");
                break;
            case 8: printEight("*");
                break;
           // case 9: printNine("*");
               // break;
            case 0: printNull("*");
                break;
            default:printNine2("9");
        }
    }
    String x = "*";
    String y = "9";
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
    private static void printFive(String x) {
        System.out.println(x+x+x+x+x);
        System.out.println(x);
        System.out.println(x);
        System.out.println(x+x+x+x+x);
        System.out.println("    "+x+" ");
        System.out.println("    "+x);
        System.out.println(x+x+x+x+x);
    }
    private static void printSix(String x) {
        System.out.println(" "+x+x+x);
        System.out.println(x);
        System.out.println(x);
        System.out.println(x+x+x+x);
        System.out.println(x+"   "+x);
        System.out.println(x+"   "+x);
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
    private static void printEight(String x) {
        System.out.println(" "+x+x+x+" ");
        System.out.println(""+x+"   "+x+" ");
        System.out.println(""+x+"   "+x+" ");
        System.out.println(" "+x+x+x+"   ");
        System.out.println(""+x+"   "+x+" ");
        System.out.println(""+x+"   "+x+" ");
        System.out.println(" "+x+x+x+" ");
    }
    private static void printNine(String x) {
        System.out.println(" "+x+x+x+x);
        System.out.println(x+"   "+x);
        System.out.println(x+"   "+x);
        System.out.println(" "+x+x+x+x);
        System.out.println("    "+x);
        System.out.println("    "+x);
        System.out.println(" "+x+x+x);
    }
    private static void printNine2(String y) {
        System.out.println(" "+y+y+y+y);
        System.out.println(y+"   "+y);
        System.out.println(y+"   "+y);
        System.out.println(" "+y+y+y+y);
        System.out.println("    "+y);
        System.out.println("    "+y);
        System.out.println(" "+y+y+y);
    }
    private static void printNull(String x) {
        System.out.println(" "+x+x+x+" ");
        System.out.println(""+x+"   "+x+" ");
        System.out.println(""+x+"   "+x+" ");
        System.out.println(x+"   "+x);
        System.out.println(""+x+"   "+x+" ");
        System.out.println(""+x+"   "+x+" ");
        System.out.println(" "+x+x+x+" ");
    }
}
