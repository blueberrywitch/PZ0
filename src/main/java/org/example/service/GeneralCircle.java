package org.example.service;

import org.example.model.Circle;
import org.example.model.Point;

public interface GeneralCircle {

    Circle readCircle();

    void printCircle(Circle circle);

    double circumference(Circle circle);

    double areaCircle(Circle circle);

    boolean containsCircle(Circle circle, Point point);

    boolean circuitCircle(Circle circle, Point point);

    boolean intersectCircle(Circle circle1, Circle circle2);

    boolean circleBelongsToCircle(Circle circle1, Circle circle2);
}
