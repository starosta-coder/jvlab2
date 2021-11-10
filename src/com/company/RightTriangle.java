package com.company;

public class RightTriangle extends Triangle {
    public RightTriangle(Point pointA, Point pointB, Point pointC) {
        super(pointA, pointB, pointC);
    }

    public boolean isRightTriangle() {
        double  a = this.getAngle(this.getPointC(), this.getPointB(), this.getPointA()),
                b = this.getAngle(this.getPointA(), this.getPointC(), this.getPointB()),
                c = this.getAngle(this.getPointB(), this.getPointA(), this.getPointC());
        return a == 90 || b == 90 || c == 90 && this.isTriangle();
    }

    @Override
    public String toString() {
        return "Right Triangle {" + "\n" +
                " A = " + this.getPointA() + ",\n" +
                " B = " + this.getPointB() + ",\n" +
                " C = " + this.getPointC() + ",\n" +
                " Is right triangle = " + this.isRightTriangle() + ",\n" +
                " Side AB = " + Format.floatFormat(this.getSide(this.getPointA(), this.getPointB())) + ",\n" +
                " Side AC = " + Format.floatFormat(this.getSide(this.getPointC(), this.getPointA())) + ",\n" +
                " Side BC = " + Format.floatFormat(this.getSide(this.getPointB(), this.getPointC())) + ",\n" +
                " Angle A = " + Format.floatFormat(this.getAngle(this.getPointC(), this.getPointB(), this.getPointA()) )+ ",\n" +
                " Angle B = " + Format.floatFormat(this.getAngle(this.getPointA(), this.getPointC(), this.getPointB())) + ",\n" +
                " Angle C = " + Format.floatFormat(this.getAngle(this.getPointB(), this.getPointA(), this.getPointC())) + ",\n" +
                " Perimeter = " + Format.floatFormat(this.getPerimeter()) + ",\n" +
                " Area = " + Format.floatFormat(this.getArea()) + "\n" +
                '}';
    }
}
