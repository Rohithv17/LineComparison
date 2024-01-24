package com.bridgelabz.linecomparison;

public class Main {
    public static void main(String[] args) {
        Point p1=new Point(2,4);
        Point p2=new Point(1,5);
        Point p3=new Point(4,8);
        Point p4=new Point(7,9);

        Line L1=new Line(p1,p2);
        Line L2=new Line(p3,p4);
        double difference = Math.abs(L1.length()- L2.length());
        System.out.println("The difference between 2 lines is: ");
        System.out.println(difference);

    }
}
