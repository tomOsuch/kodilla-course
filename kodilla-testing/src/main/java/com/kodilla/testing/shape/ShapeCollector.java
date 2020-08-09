package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        return shapes.remove(shape);
    }

    public Shape getFigure(int n) {
        if (!shapes.isEmpty()){
            return shapes.get(n);
        } else {
            return null;
        }
    }

    public String showFigure() {
        String message = null;
        for (Shape shape : shapes) {
            message = String.join(", ", shape.getShapeName());
        }
        return message;
    }
}
