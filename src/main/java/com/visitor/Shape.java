package com.visitor;

public interface Shape {

    // Each concrete class is expected to define accepted method
    void accept(ShapeVisitor visitor);
}
