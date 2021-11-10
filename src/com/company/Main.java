package com.company;

public class Main {

    public static void main(String[] args) {
        Triangles triangles = new Triangles();
        RightTriangles rightTriangles = new RightTriangles();

        triangles.add(new Triangle(new Point(0.5, 0), new Point(0, 0.5), new Point(0.683, 0.683)));
        triangles.add(new Triangle(new Point(1, 1), new Point(2, 2), new Point(2, 1)));
        triangles.add(new Triangle(new Point(0, 0), new Point(1, 1), new Point(1, 0)));
        System.out.println(triangles);
        System.out.println(triangles.getMaxArea());
        System.out.println(triangles.getMinArea());

        rightTriangles.add(new RightTriangle(new Point(1, -3), new Point(1, 5), new Point(6, -2)));
        rightTriangles.add(new RightTriangle(new Point(1, -2), new Point(1, 5), new Point(6, -2)));
        rightTriangles.add(new RightTriangle(new Point(1, -2), new Point(1, 5), new Point(6, -2)));
        System.out.println(rightTriangles);
        rightTriangles.printEqual();
    }
}
