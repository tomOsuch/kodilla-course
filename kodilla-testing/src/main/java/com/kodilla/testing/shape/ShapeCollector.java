package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean resultRemove = false;
        if (shapes.contains(shape)) {
            shapes.remove(shape);
            resultRemove = true;
        }
        return resultRemove;
    }

    public Shape getFigure(int n) {
        return shapes.get(n);
    }

    public String showFigure() {

        StringBuilder stringBuilder = new StringBuilder();
        int sizeList = shapes.size();
        for (int i = 0; i < sizeList - 1; i++) {
            stringBuilder.append(shapes.get(i).getShapeName()).append(", ");
        }

        return stringBuilder + shapes.get(sizeList - 1).getShapeName();
    }
}
