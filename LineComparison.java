package LineComparison;
import java.awt.*;
import java.lang.Math;

import static java.lang.Double.compare;

public class LineComparison {
    public static void main(String[] args) {

        Point p1 = new Point(6, 4);
        Point p2 = new Point(8, 9);
        Point p3 = new Point(7, 2);
        Point p4 = new Point(8, 7);
        double length1 = Math.sqrt((p2.y - p1.y) ^ 2 + (p2.x - p1.x) ^ 2); //Length of the line 1
        double length2 = Math.sqrt((p4.y - p3.y) ^ 2 + (p4.x - p3.x) ^ 2); //Length of the line 2
        System.out.print("Length of line 1 is ");
        System.out.println(length1);
        System.out.print("Length of line 2 is ");
        System.out.println(length2);

        // UC3-To Compare Length of the 2 lines using compare method()
        System.out.println(compare(length1,length2)); // returns 0 if lengths are equal
                                                      // returns 1 if length1 is greater
                                                      // returns -1 if length2 is greater
    }
}