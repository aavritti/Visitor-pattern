package com.visitor;

import com.visitor.models.Circle;
import com.visitor.models.Rectangle;
import com.visitor.models.Triangle;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class VisitorApplicationTests {

    public static final double EXPECTED_SHIPPING_COST = 27.0;

    @Test
    void visitorExampleTest() {
        Shape[] shapes = new Shape[]{
                new Circle(6.565),
                new Rectangle(3.45, 14.467),
                new Triangle(2.1,8)
        };
        ShapeVisitor visitor = new AreaVisitor();
        for(Shape shape : shapes){
//            System.out.println(String.format("%.2f",shape.accept(visitor)));
//            Assert.isTrue(shape.accept(visitor) == 222.2, "dedede");

        }
    }

}
