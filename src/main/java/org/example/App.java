package org.example;

import org.example.model.Point;
import org.example.service.PointService;
import util.Scan;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        PointService pointService = new PointService();
        Point point = new Point(Scan.scanDouble(), Scan.scanDouble());
        pointService.printCoordinates(point);
        System.out.println( "Hello World!" );
    }
}
