package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> shapeList = new ArrayList<>();
    private Shape shape;

    public ShapeCollector(Shape shape){
        this.shape=shape;
    }

    public ArrayList<Shape> getShapeList() {
        return shapeList;
    }


    /*
    public int getListSize(){
        return shapeList.size();
    } */

    public ShapeCollector()
    {

    }

    public boolean addFigure (Shape shape) {

        return true;



    }

    public boolean removeFigure(Shape shape) {

        return true;



    }

    public Shape getFigure(int n) {

        return shape;

    }

    public void showFigures() {

    }
}
