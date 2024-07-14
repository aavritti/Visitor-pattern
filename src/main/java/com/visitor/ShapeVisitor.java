package com.visitor;

import com.visitor.models.Circle;
import com.visitor.models.Rectangle;
import com.visitor.models.Triangle;

public interface ShapeVisitor {

     void visit(Rectangle rectangle);
     void visit(Circle circle);
     void visit(Triangle triangle);
}
