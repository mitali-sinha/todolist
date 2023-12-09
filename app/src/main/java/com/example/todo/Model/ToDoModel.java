package com.example.todo.Model;

public class ToDoModel {
    private String task;
    private int id , Status;

    public String getTask() {
        return task;
    }
    public void setTask(String task) {
        this.task = task;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
