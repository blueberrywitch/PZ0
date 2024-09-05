package org.example.service;

import org.example.model.Point;
import util.Scan;

public class PointService implements GeneralPoint {

    public Point readPoint(){
        Point point = new Point(Scan.scanDouble(), Scan.scanDouble());
        return point;
    }

    public void printCoordinates(Point point){
        System.out.println(point);
    }
}
