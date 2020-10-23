package com.kodilla.hibernate.tasklist;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table(name = "TASKLIST")
public class TaskList {
    private int id;
    private String listName;
    private String description;

    public TaskList() {

    }

    public TaskList(String listName, String description) {
        this.listName = listName;
        this.description = description;
    }

    @Id
    @GeneratedValue
    @NonNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @Column(name = "LISTNAME")
    public String getListName() {
        return listName;
    }

    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setListName(String lastName) {
        this.listName = lastName;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
