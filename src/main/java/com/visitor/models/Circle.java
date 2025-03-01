package com.visitor.models;

import com.visitor.ShapeVisitor;
import com.visitor.Shape;

public class Circle implements Shape {
    private final double radius;

    public Circle(final double radius) {
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    @Override
    public void accept(final ShapeVisitor visitor) {

        visitor.visit(this);
    }
}
