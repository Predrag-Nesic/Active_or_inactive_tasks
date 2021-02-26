package project;

import java.util.ArrayList;
import java.util.Collections;

public class Group {
    protected String name;
    protected ArrayList<Task> tasks;

    public Group(String name) {
        this.name = name;
        tasks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addTask(Task task) {
        if(tasks.contains(task)) {
            return;
        }
        tasks.add(task);
        Collections.sort(tasks);
    }

    public int totalOfEmployeesOnActiveTasks() {
        int total = 0;
        for(Task task : tasks) {
            if(task.getState().equals("active")) {
                total += task.totalEmployees();
            }
        }
        return total;
    }

    public int totalOfEmployeesOnInactiveTasks() {
        int total = 0;
        for(Task task : tasks) {
            if(task.getState().equals("closed")) {
                total += task.totalEmployees();
            }
        }
        return total;
    }

    public int totalOfActiveTasks() {
        int total = 0;
        for(Task task : tasks) {
            if(task.getState().equals("active")) {
                total++;
            }
        }
        return total;
    }

    public int totalOfInactiveTasks() {
        int total = 0;
        for(Task task : tasks) {
            if(task.state.equals("closed")) {
                total++;
            }
        }
        return total;
    }

    public int totalOfEmployees() {
        int total = 0;
        for(Task task : tasks) {
            total += task.totalEmployees();
        }
        return total;
    }

    public void listOfInactiveEmployees() {
        for(Task task : tasks) {
            task.inactiveEmployees();
        }
    }

    @Override
    public String toString() {
        String text = "Group " + name + " ({" + totalOfEmployees() + "} employees on {" + tasks.size() + "} tasks)\n";
        for(Task task : tasks) {
            text += task + "\n";
        }
        return text;
    }
}
