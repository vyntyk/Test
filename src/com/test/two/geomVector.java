package com.test.two;
import java.util.*;

class geomVector{
    public double x1,x2,y1,y2,xV,yV,xM,yM,vL;
    public void setVector(double a1,double b1, double a2, double b2){
        x1 = a1;
        x2 = a2;
        y1 = b1;
        y2 = b2;
    }
    public void getVectorCoords(){
        xV = x2 - x1;
        yV = y2 - y1;
    }
    public void getMiddleCoords(){
        getVectorCoords();
        xM = xV/2;
        yM = yV/2;
    }
    public void multiplyVector(double a){
        x1*=a;
        x2*=a;
        y1*=a;
        y2*=a;
        getVectorCoords();
        getMiddleCoords();
    }
    public double getLength(){
        return vL = Math.sqrt(xV*xV+yV*yV);
    }
    public void vectorSum(geomVector a,geomVector b){
        a.setVector(a.x1,a.y1,b.x2,b.y2);
    }
    public double scalMult(geomVector a,geomVector b) {
        return (a.xV*b.xV+a.yV*b.yV);
    }
    public double getAngle(geomVector a, geomVector b) {
        return Math.acos(scalMult(a,b)/(a.getLength()*b.getLength()));
    }
}

class Main2 {
    public static void main(String[] args){
        double x1,x2,x3,x4,y1,y2,y3,y4;

        Scanner in = new Scanner(System.in);
        x1 = in.nextDouble();
        x2 = in.nextDouble();
        x3 = in.nextDouble();
        x4 = in.nextDouble();
        y1 = in.nextDouble();
        y2 = in.nextDouble();
        y3 = in.nextDouble();
        y4 = in.nextDouble();

        geomVector a = new geomVector();
        geomVector b = new geomVector();

        a.setVector(x1,y1,x2,y2);
        b.setVector(x3,y3,x4,y4);

        a.getVectorCoords();
        b.getVectorCoords();

        System.out.println(a.getLength());
        System.out.println(b.scalMult(b,a));
        System.out.println(a.getAngle(a,b));
    }
}