package project;

import java.util.ArrayList;

public class Project {
    private String name;
    private int code;
    private ArrayList<Group> groups;

    public Project(String name, int code) {
        this.name = name;
        this.code = code;
        groups = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void addGroup(Group group) {
        if(groups.contains(group)) {
            return;
        }
        groups.add(group);
    }

    @Override
    public String toString() {
        String text = "Project " + name + "\n";
        for(Group group : groups) {
            text += group + "\n";
        }

        int totalActive = 0;
        for(Group group : groups) {
            totalActive += group.totalOfEmployeesOnActiveTasks();
        }
        text += "Total of employees on active tasks: " + totalActive + "\n";

        int totalInactive = 0;
        for(Group group : groups) {
            totalInactive += group.totalOfEmployeesOnInactiveTasks();
        }
        text += "Total of employees on inactive tasks: " + totalInactive + "\n";

        int totalActiveTasks = 0;
        for(Group group : groups) {
            totalActiveTasks += group.totalOfActiveTasks();
        }
        text += "Total of active tasks: " + totalActiveTasks;

        return text;
    }
}
