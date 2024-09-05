package org.example.service;

import org.example.model.Circle;
import org.example.model.Square;

public class SquareCircleService implements GeneralSquareCircle{

    public boolean intersectSquareCircle(Square square, Circle circle){
        return (Math.abs(square.getStartingPoint().getX() + 0.5*square.getLength() - circle.getCenter().getX()) <= 0.5*square.getLength() + circle.getRadius()) &&
                (Math.abs(square.getStartingPoint().getY() - 0.5*square.getLength() - circle.getCenter().getX()) <= 0.5*square.getLength() + circle.getRadius());
    }

    public boolean squareBelongsToCircle(Square square, Circle circle){
        return (Math.hypot(square.getStartingPoint().getX(), square.getStartingPoint().getY()) <= Math.pow(circle.getRadius(),2)) &&
                (Math.hypot(square.getStartingPoint().getX() + square.getLength(), square.getStartingPoint().getY()) <= Math.pow(circle.getRadius(),2)) &&
                (Math.hypot(square.getStartingPoint().getX() + square.getLength(), square.getStartingPoint().getY() - square.getLength()) <= Math.pow(circle.getRadius(),2)) &&
                (Math.hypot(square.getStartingPoint().getX(), square.getStartingPoint().getY() - square.getLength()) <= Math.pow(circle.getRadius(),2));
    }

    public boolean circleBelongsToSquare(Square square,Circle circle){
        return (((Math.abs(square.getStartingPoint().getX() + square.getLength() * 0.5 - circle.getCenter().getX() - circle.getRadius()) < square.getLength()) || Math.abs(square.getStartingPoint().getX() + square.getLength() * 0.5 - circle.getCenter().getX() + circle.getRadius()) < square.getLength()) &&
                (Math.abs(square.getStartingPoint().getY() + square.getLength() * 0.5 - circle.getCenter().getY()) < square.getLength())) &&
                ((Math.abs(square.getStartingPoint().getX() + square.getLength() * 0.5 - circle.getCenter().getX()) < square.getLength()) && ((Math.abs(square.getStartingPoint().getY() + square.getLength() * 0.5 - circle.getCenter().getY() - circle.getRadius()) < square.getLength())) ||
                (Math.abs(square.getStartingPoint().getY() + square.getLength() * 0.5 - circle.getCenter().getY() + circle.getRadius()) < square.getLength()));
    }

}
