package com.company;

import java.util.ArrayList;

public class RightTriangles {
    private final ArrayList<RightTriangle> rightTriangles = new ArrayList<>();

    public void add(RightTriangle triangle) {
        rightTriangles.add(triangle);
    }

    public void printEqual() {
        for (int j = 0; j < this.rightTriangles.size(); j++) {
            for (int i = j + 1; i < this.rightTriangles.size(); i++) {
                if (isTrianglesEqual(this.rightTriangles.get(i), this.rightTriangles.get(j))) {
                   System.out.println("Equal right triangles numbers: " + j + " and " + i);
                }
            }
        }
    }

    @Override
    public String toString() {
        int i = 0;
        StringBuilder str = new StringBuilder();
        for(RightTriangle triangle: this.rightTriangles) {
            str.append("====").append(i).append("====\n").append(triangle).append("\n");
            i++;
        }
        str.append("========");
        return str.toString();
    }

    private static boolean isTrianglesEqual(RightTriangle a, RightTriangle b) {
        if (!a.isTriangle() || !b.isTriangle()) { return false; }
        double  A1 = a.getSide(a.getPointA(), a.getPointB()),
                A2 = a.getSide(a.getPointC(), a.getPointA()),
                A3 = a.getSide(a.getPointB(), a.getPointC()),
                B1 = b.getSide(b.getPointA(), b.getPointB()),
                B2 = b.getSide(b.getPointC(), b.getPointA()),
                B3 = a.getSide(a.getPointB(), a.getPointC());

        return Math.abs(A1 - B1) < 0.001 && Math.abs(A2 - B2) < 0.001 && Math.abs(A3 - B3) < 0.001;
    }
}
