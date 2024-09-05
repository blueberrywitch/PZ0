package org.example.service;

import org.example.model.Circle;
import org.example.model.Square;

public interface GeneralSquareCircle {

    boolean intersectSquareCircle(Square square, Circle circle);

    boolean squareBelongsToCircle(Square square,Circle circle);

    boolean circleBelongsToSquare(Square square,Circle circle);
}
