package com.company;

import java.util.Date;

public class Task {
    String programmer;
    String name_task;
    Date start;
    Date deadline;

    public Task(String programmer, String name_task, Date start, Date deadline) {
        this.programmer = programmer;
        this.name_task = name_task;
        this.start = start;
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "Task{" +
                "programmer='" + programmer + '\'' +
                ", name_task='" + name_task + '\'' +
                ", start=" + start +
                ", deadline=" + deadline +
                '}';
    }
}
