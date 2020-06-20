package com.practice.spring.shapes;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * <b>Description</b> : Circle class to demonstrate @Autowired annotation
 *
 * @author Vinod Akkepalli
 */
public class Circle {

    //Autowiring by name
    @Autowired
    private Point center;

    public Circle(Point center) {
        this.center = center;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                '}';
    }
}
