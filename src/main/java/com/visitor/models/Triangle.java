package com.visitor.models;

import com.visitor.ShapeVisitor;
import com.visitor.Shape;

public class Triangle implements Shape {

    private final double base;
    private final double height;

    public Triangle(final double base, final double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void accept(final ShapeVisitor visitor){
         visitor.visit(this);
    }
}
