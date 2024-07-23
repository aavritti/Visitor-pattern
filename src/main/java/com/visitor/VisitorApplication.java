package com.visitor;

import com.visitor.models.Circle;
import com.visitor.models.Rectangle;
import com.visitor.models.Triangle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;
import java.util.stream.Collectors;


public class VisitorApplication {

    public static void main(String[] args) {
        final List<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(10)); 
        shapes.add(new Rectangle(10, 2));

        final AreaVisitor areaVisitor = new AreaVisitor();

        for (Shape shape: shapes) {
            shape.accept(areaVisitor);
            final double area = areaVisitor.get();

            System.out.printf(
                    "Area of %s: %.2f%n",
                    shape.getClass().getSimpleName(),
                    area
            );
        }

        System.out.println("---------------------------------");


    }
}