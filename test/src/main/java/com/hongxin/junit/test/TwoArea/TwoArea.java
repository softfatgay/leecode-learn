package com.hongxin.junit.test.TwoArea;


public class TwoArea {


    public static void main(String[] args) {

        Rect P = new Rect(20, 20, 100, 140);
        Rect Q = new Rect(10, 11, 100, 180);

        double overLay = getArea(P, Q);
        System.out.println(overLay);
    }


    // 牛顿迭代法计算平方根
    public static double sqrt(double c) {
        if (c < 0) return Double.NaN;
        double err = 1e-15;
        double t = c;
        while (Math.abs(t - c / t) > err * t)//也就是1-c/(t^2)=err
            t = (c / t + t) / 2.0;
        return t;
    }


    public static double getArea( Rect p,  Rect q) {
        double xMin = Math.min(p.x, q.x);
        double yMin = Math.min(p.y, q.y);
        double xMax = Math.max(p.x + p.getWidth(), q.x + q.getWidth());
        double yMax = Math.max(p.y + p.getHeight(), q.y + q.getHeight());
        double x = q.getWidth() + p.getWidth() - (xMax - xMin);
        double y = q.getHeight() + p.getHeight() - (yMax - yMin);
        if (x < 0 || y < 0) {
            return 0;
        }

        return x * y;
    }

}
