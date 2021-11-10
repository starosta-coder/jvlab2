package com.company;

import lombok.Getter;

public class Triangle {

    @Getter private final Point pointA, pointB, pointC;

    public Triangle(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    public boolean isTriangle() {
        double  a = getSide(this.pointA, this.pointB),
                b = getSide(this.pointB, this.pointC),
                c = getSide(this.pointC, this.pointA);
        return a + b > c && a + c > b && b + c > a;
    }

    public double getSide(Point x, Point y) {
        double  X = y.getX() - x.getX(),
                Y = y.getY() - x.getY();
        return Math.sqrt(Math.pow(X, 2) + Math.pow(Y, 2));
    }

    public double getAngle(Point a, Point b, Point c) {
        Point   ac = new Point(c.getX() - a.getX(), c.getY() - a.getY()),
                bc = new Point(c.getX() - b.getX(), c.getY() - b.getY());

        return Math.acos((ac.getX() * bc.getX() + ac.getY() * bc.getY()) / (getSide(a, c) * getSide(b, c))) * 180 / Math.PI;
    }

    public double getPerimeter() {
        double  a = getSide(this.pointA, this.pointB),
                b = getSide(this.pointB, this.pointC),
                c = getSide(this.pointC, this.pointA);
        return a + b + c;
    }

    public double getArea() {
        double  a = getSide(this.pointA, this.pointB),
                b = getSide(this.pointB, this.pointC),
                c = getSide(this.pointC, this.pointA),
                p = getPerimeter() / 2;

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public String toString() {
        return "Triangle {" + "\n" +
                " A = " + this.pointA + ",\n" +
                " B = " + this.pointB + ",\n" +
                " C = " + this.pointC + ",\n" +
                " Is triangle = " + this.isTriangle() + ",\n" +
                " Side AB = " + Format.floatFormat(this.getSide(this.pointA, this.pointB)) + ",\n" +
                " Side AC = " + Format.floatFormat(this.getSide(this.pointC, this.pointA)) + ",\n" +
                " Side BC = " + Format.floatFormat(this.getSide(this.pointB, this.pointC)) + ",\n" +
                " Angle A = " + Format.floatFormat(this.getAngle(this.pointC, this.pointB, this.pointA) )+ ",\n" +
                " Angle B = " + Format.floatFormat(this.getAngle(this.pointA, this.pointC, this.pointB)) + ",\n" +
                " Angle C = " + Format.floatFormat(this.getAngle(this.pointB, this.pointA, this.pointC)) + ",\n" +
                " Perimeter = " + Format.floatFormat(this.getPerimeter()) + ",\n" +
                " Area = " + Format.floatFormat(this.getArea()) + "\n" +
                '}';
    }
}
