package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Triangles {
    private final ArrayList<Triangle> triangles = new ArrayList<>();

    public void add(Triangle triangle) {
        triangles.add(triangle);
    }

    public Triangle getMaxArea() {
        System.out.println("Max area Triangle: ");
        return Collections.max(this.triangles, new TriangleComparator());
    }

    public Triangle getMinArea() {
        System.out.println("Min area Triangle: ");
        return Collections.min(this.triangles, new TriangleComparator());
    }

    @Override
    public String toString() {
        int i = 0;
        StringBuilder str = new StringBuilder();
        for(Triangle triangle: this.triangles) {
            str.append("====").append(i).append("====\n").append(triangle).append("\n");
            i++;
        }
        str.append("========");
        return str.toString();
    }
}

class TriangleComparator implements Comparator<Triangle> {
    @Override
    public int compare(Triangle a, Triangle b) {
        return Double.compare(a.getArea(), b.getArea());
    }
}