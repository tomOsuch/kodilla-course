package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private String nameShape;
    private List<Shape> shapes = new ArrayList<>();

    public ShapeCollector(String nameShape) {
        this.nameShape = nameShape;
    }

    public Shape addFigure(Shape shape) {
        return null;
    }

    public boolean removeFigure(Shape shape) {
        return true;
    }

    public Shape getFigure(int n) {
        return null;
    }

    public String showFigure() {
        return null;
    }

    public int getShapeQuantity() {
        return shapes.size();
    }

    @Override
    public String toString() {
        return nameShape;
    }
}
