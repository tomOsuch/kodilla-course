package com.kodilla.spring.portfolio;

public class Board {

    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }

    public void setToDoList(TaskList toDoList) {
        this.toDoList = toDoList;
    }

    public void setInProgressList(TaskList inProgressList) {
        this.inProgressList = inProgressList;
    }

    public void setDoneList(TaskList doneList) {
        this.doneList = doneList;
    }

    public void getAllBoard() {
        System.out.println("Board: " + getToDoList() + getInProgressList() + getDoneList());
    }
}
