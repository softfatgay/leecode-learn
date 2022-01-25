package com.hongxin.junit.test.TwoArea;

public class Rect {
    double x;
    double y;
    double width;
    double height;

    public Rect(double leftx, double righty, double width, double height) {
        this.x = leftx;
        this.y = righty;
        this.width = width;
        this.height = height;
    }

    public double getLeftx() {
        return x;
    }

    public void setLeftx(double leftx) {
        this.x = leftx;
    }

    public double getRighty() {
        return y;
    }

    public void setRighty(double righty) {
        this.y = righty;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}