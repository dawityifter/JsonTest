package com.dawiityifter.json;
public class Circle extends Shape {
    private int radius;
    public Circle(){}
    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public static Circle of(int i) {
        return new Circle(i);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
