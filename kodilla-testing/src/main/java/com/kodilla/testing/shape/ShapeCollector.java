package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ShapeCollector {
    private List<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        return shapes.remove(shape);
    }

    public Shape getFigure(int n) {
        if (n < shapes.size()){
            return shapes.get(n);
        } else {
            return null;
        }
    }

    public String showFigure() {
        return shapes.stream().map(Shape::getShapeName).collect(Collectors.joining(", "));
    }
}
