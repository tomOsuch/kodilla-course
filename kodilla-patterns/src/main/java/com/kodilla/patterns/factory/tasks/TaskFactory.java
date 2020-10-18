package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task makeTask(final String taskClass) {
        return switch (taskClass) {
            case DRIVING -> new DrivingTask("driving taxi", "Dom", "test");
            case PAINTING -> new PaintingTask("Painting color", "", "");
            case SHOPPING -> new ShoppingTask("Zakupy", "owoce", 15.9);
            default -> null;
        };
    }
}
