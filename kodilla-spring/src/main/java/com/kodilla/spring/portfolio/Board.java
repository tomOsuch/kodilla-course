package com.kodilla.spring.portfolio;

import java.util.List;

public class Board {

    private List<TaskList> toDoList;
    private List<TaskList> inProgressList;
    private List<TaskList> doneList;

    public List<TaskList> getToDoList() {
        return toDoList;
    }

    public List<TaskList> getInProgressList() {
        return inProgressList;
    }

    public List<TaskList> getDoneList() {
        return doneList;
    }

    public void setToDoList(List<TaskList> toDoList) {
        this.toDoList = toDoList;
    }

    public void setInProgressList(List<TaskList> inProgressList) {
        this.inProgressList = inProgressList;
    }

    public void setDoneList(List<TaskList> doneList) {
        this.doneList = doneList;
    }
}
