package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {

    private final String name;
    private int totalTaskCount;

    public Mentor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getTotalTaskCount() {
        return totalTaskCount;
    }

    @Override
    public void notifyAboutNewTask(TraineeTasks traineeTasks) {
        System.out.println(
                "Twój kursant: " + traineeTasks.getTrainee().getName() +
                        " dodał zadanie: " + traineeTasks.getLastTask(traineeTasks.getTasks()) +
                        " Liczba wszystkich zadań kursanta to: " + traineeTasks.getTaskCount(traineeTasks.getTasks())
        );
        totalTaskCount++;
    }
}
