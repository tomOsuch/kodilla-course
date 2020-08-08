package com.kodilla.testing.shape;

public class Circle implements Shape {
    private String shapeName;
    private String field;

    public Circle(String shapeName, String field) {
        this.shapeName = shapeName;
        this.field = field;
    }

    @Override
    public void getShapeName() {
        System.out.println(shapeName);
    }

    @Override
    public void getField() {
        System.out.println(field);
    }
}
