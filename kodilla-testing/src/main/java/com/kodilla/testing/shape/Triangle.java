package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private String shapeName;
    private double basis;
    private double height;

    public Triangle(String shapeName, double basis, double height) {
        this.shapeName = shapeName;
        this.basis = basis;
        this.height = height;
    }

    @Override
    public String getShapeName() {
        return null;
    }

    @Override
    public double getField() {
        return 0;
    }
}
