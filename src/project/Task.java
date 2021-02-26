package project;

import team.Employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Task implements Comparable<Task> {
    protected String name;
    protected String description;
    protected String state;
    protected int day;
    protected int month;
    protected int year;
    protected ArrayList<Employee> employees;

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
        this.state = "active";
        this.employees = new ArrayList<>();
        LocalDate date = LocalDate.now();
        day = date.getDayOfMonth();
        month = date.getMonthValue();
        year = date.getYear();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void addEmployee(Employee employee) {
        if(employees.contains(employee)) {
            return;
        }
        employees.add(employee);
        Collections.sort(employees);
    }

    public void closeTask() {
        this.setState("closed");
    }

    public int totalEmployees() {
        return employees.size();
    }

    public void numberOfActiveEmployees() {
        if(state.equals("active")) {
            employees.size();
        }

    }

    public void inactiveEmployees() {
        for(Employee employee : employees) {
            if(state.equals("closed")) {
                System.out.println(employee);
            }
        }
    }

    @Override
    public String toString() {
        String text = "Task " + name + "(" + day + "." + month + "." + year + ".)" + " state (" + state + ")\n";
        for(Employee employee : employees) {
            text += "- " + employee + "\n";
        }
        return text;
    }

    @Override
    public int compareTo(Task o) {
        if(year < o.year || year == o.year && month < o.month || year == o.year && month < o.month && day < o.day) {
            return 1;
        } else if(year == o.year && month == o.month && day == o.day) {
            return 0;
        } else {
            return -1;
        }
    }
}
