package com.bridgelabz.linecomparison;

public class Line {

    Point p1;
    Point p2;

    public Line(Point p1,Point p2) {
        this.p1 = p1;
        this.p2=p2;
    }
     public double length(){
         double lineLength = Math.sqrt((p2.y - p1.y) ^ 2 + (p2.x - p1.x) ^ 2);
         return  lineLength;
     }
}
