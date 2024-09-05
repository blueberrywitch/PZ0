package org.example.service;

import org.example.model.Circle;
import org.example.model.Point;
import org.example.model.Square;


public interface GeneralSquare {

    Square readSquare();

    void printSquare(Square square);

    double perimeter(Square square);

    double areaSquare(Square square);

    boolean containsSquare(Square square, Point point);

    boolean circuitSquare(Square square, Point point);

    boolean intersectSquare(Square square1, Square square2);

    boolean squareBelongsToSquare(Square square1, Square square2);
}
