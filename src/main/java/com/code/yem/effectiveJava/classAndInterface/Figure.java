package com.code.yem.effectiveJava.classAndInterface;

public class Figure {
    enum Shape {RECTANGLE, CIRCLE}

    ;

    final Shape shape;

    double length;
    double width;

    double radius;

    Figure(double radius) {
        shape = Shape.CIRCLE;
    }

    Figure(double length, double width) {
        shape = Shape.RECTANGLE;
        this.length = length;
        this.width = width;
    }
}

abstract class AbstractFigure {
    abstract double area();
}

class Circle extends AbstractFigure {
    final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * (radius * radius);
    }
}
