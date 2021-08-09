package com.test.two;
import java.util.Scanner;

public class Vector {
    private int dx, dy;

    Vector() {
        dx = dy = 0;
    }
    Vector(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public double getLength() {
        return Math.sqrt(dx * dx + dy * dy);
    }

    public int Scalar(Vector v) {
        return v.dx * dx + v.dy * dy;
    }

    public double GetAngle(Vector v) {
        int s = this.Scalar(v);
        return Math.acos(s/this.getLength() / v.getLength());
    }
}
class Main {

    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        System.out.println("Введите координаты первого вектора");
        // первый вектор - координаты точек
        int a1 = Integer.parseInt(con.next());
        int b1 = Integer.parseInt(con.next());
        int a2 = Integer.parseInt(con.next());
        int b2 = Integer.parseInt(con.next());
        int a = a2-a1;
        int b = b2-b1;
        Vector u = new Vector(a, b);

        System.out.println("Введите координаты второго вектора");
        // второй вектор - координаты точек
        int a3 = Integer.parseInt(con.next());
        int b3 = Integer.parseInt(con.next());
        int a4 = Integer.parseInt(con.next());
        int b4 = Integer.parseInt(con.next());
        a = a4-a3;
        b = b4-b3;
        Vector v = new Vector(a, b);
        System.out.println("Длина первого вектора: " +u.getLength());
        System.out.println("Длина второго вектора: " +v.getLength());

        System.out.println("Скалярное произведение векторов: "+ u.Scalar(v));
        System.out.println(u.GetAngle(v));

        con.close();
    }
}

