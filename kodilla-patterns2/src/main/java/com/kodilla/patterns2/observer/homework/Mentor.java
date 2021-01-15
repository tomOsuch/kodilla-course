package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {

    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    @Override
    public void notifyAboutNewTask(TraineeTasks traineeTasks) {
        System.out.println(
                "Twój kursant: " + traineeTasks.getTrainee().getName() +
                        " dodał zadanie: " + traineeTasks.getTasks().peekLast() +
                        " Liczba wszystkich zadań kursanta to: " + traineeTasks.getTasks().size()
        );
        updateCount++;
    }
}
