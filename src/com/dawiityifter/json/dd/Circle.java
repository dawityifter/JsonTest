package com.dawiityifter.json.dd;

import com.dawiityifter.json.Shape;

public class Circle extends Shape{
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

    public static Shape of(int i) {
        return new Circle(i);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
