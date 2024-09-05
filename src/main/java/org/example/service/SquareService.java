package org.example.service;


import org.example.model.Square;
import org.example.model.Point;
import util.Scan;

public class SquareService implements GeneralSquare {

    public Square readSquare() {
        Point startingPoint = new Point(Scan.scanDouble(), Scan.scanDouble());
        Square square = new Square(startingPoint, Scan.scanDouble());
        return square;
    }

    public void printSquare(Square square) {
        System.out.println(square);
    }

    public double perimeter(Square square) {
        return square.getLength() * 2;
    }

    public double areaSquare(Square square) {
        return Math.pow(square.getLength(), 2);
    }

    public boolean containsSquare(Square square, Point point) {
        return ((Math.abs(square.getStartingPoint().getX() + square.getLength() * 0.5 - point.getX()) < square.getLength())
                && (Math.abs(square.getStartingPoint().getY() + square.getLength() * 0.5 - point.getY()) < square.getLength()));
    }

    public boolean circuitSquare(Square square, Point point) {
        return ((Math.abs(square.getStartingPoint().getX() + square.getLength() * 0.5 - point.getX()) < 1e-5)
                && (Math.abs(square.getStartingPoint().getY() - point.getY()) < 1e-5)
                || (Math.abs(square.getStartingPoint().getY() + square.getLength() - point.getY())) < 1e-5) ||
                ((Math.abs(square.getStartingPoint().getY() + square.getLength() * 0.5 - point.getY()) < 1e-5)
                && (Math.abs(square.getStartingPoint().getX() - point.getX()) < 1e-5)
                || (Math.abs(square.getStartingPoint().getX() + square.getLength() - point.getX()) < 1e-5));
    }

    public boolean intersectSquare(Square square1, Square square2) {
        return ((Math.abs(square1.getStartingPoint().getX() - square2.getStartingPoint().getX()) < square1.getLength()) ||
                (Math.abs(square1.getStartingPoint().getX() - square2.getStartingPoint().getX()) < square2.getLength())) &&
                ((Math.abs(square1.getStartingPoint().getY() - square2.getStartingPoint().getY()) < square1.getLength()) ||
                (Math.abs(square1.getStartingPoint().getY() - square2.getStartingPoint().getY()) < square2.getLength()));
    }

    public boolean squareBelongsToSquare(Square square1, Square square2){
        return ((Math.abs(square2.getStartingPoint().getX() + square2.getLength() * 0.5 - square1.getStartingPoint().getX())
                < square2.getLength()) && (Math.abs(square2.getStartingPoint().getY() + square2.getLength() * 0.5 - square1.getStartingPoint().getY())
                < square2.getLength())) && (Math.abs(square2.getStartingPoint().getX() + square2.getLength() * 0.5 -
                (square1.getStartingPoint().getX() + square1.getLength())) < square2.getLength()) &&
                (Math.abs(square2.getStartingPoint().getY() + square2.getLength() * 0.5 - square1.getStartingPoint().getY() - square1.getLength()) < square2.getLength());

    }
}
