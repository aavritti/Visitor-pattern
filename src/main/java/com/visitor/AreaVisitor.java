package com.visitor;

import com.visitor.models.Circle;
import com.visitor.models.Rectangle;
import com.visitor.models.Triangle;

public class AreaVisitor implements ShapeVisitor {

    private double area;

    //Logic to get area of circle
    @Override
    public void visit(final Circle circle){
        area = Math.PI * Math.pow(circle.getRadius(), 2);
    }

    //Logic to get area of Rectangle
    @Override
    public void visit(final Rectangle rectangle){
        area = rectangle.getLength()*rectangle.getWidth();
    }

    //Logic to get area of Triangle
    @Override
    public void visit(final Triangle triangle) {
        area =  (triangle.getBase()*triangle.getHeight())/2;
    }

    public double get(){
        return this.area;
    }
}
