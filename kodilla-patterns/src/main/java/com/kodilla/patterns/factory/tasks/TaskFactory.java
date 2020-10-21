package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public final Task createTask(final TaskType type) {
        return switch (type) {
            case DRIVING -> new DrivingTask("driving taxi", "Dom", "test");
            case PAINTING -> new PaintingTask("Painting color", "Red", "");
            case SHOPPING -> new ShoppingTask("Zakupy", "owoce", 15.9);
        };
    }
}
