package com.itmo.objects1;

/**
 * Created by xmitya on 18.09.16.
 */
public class Point2D {
    int x;
    int y;

    public Point2D() {
        this(-1, -1);
    }

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Point2D point2D = new Point2D();

        System.out.println(point2D.x + " " + point2D.y);
    }
}
