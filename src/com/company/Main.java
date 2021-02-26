package com.company;

import project.Group;
import project.Project;
import project.Task;
import team.Employee;

public class Main {

    public static void main(String[] args) {
        Employee e1 = new Employee("Predrag", "Nesic", "p@gmail.com");
        Employee e2 = new Employee("Jelena", "Nikolic", "j@gmail.com");
        Employee e3 = new Employee("Bojana", "Acimovac", "b@gmail.com");
        Employee e4 = new Employee("Jelena", "Erakovic", "e@gmail.com");
        Employee e5 = new Employee("Predrag", "Kovic", "k@gmail.com");
        Employee e6 = new Employee("Marko", "Nesic", "m@gmail.com");
        Employee e7 = new Employee("Zvezdan", "Nedeljkovic", "z@gmail.com");
        Employee e8 = new Employee("Dusan", "Tosic", "d@gmail.com");


        Task task1 = new Task("First", "Important");
        task1.addEmployee(e1);
        task1.addEmployee(e2);

        Task task2 = new Task("Second", "Simple");
        task2.addEmployee(e3);
        task2.addEmployee(e4);

        Task task3 = new Task("Third", "Simple");
        task3.addEmployee(e5);
        task3.addEmployee(e6);

        Task task4 = new Task("Fourth", "Important");
        task4.addEmployee(e7);
        task4.addEmployee(e8);

        Group g1 = new Group("Programmers 1");
        g1.addTask(task1);
        g1.addTask(task2);

        Group g2 = new Group("Programmers 2");
        g2.addTask(task3);
        g2.addTask(task4);

        Project project = new Project("Lyngby", 123);
        project.addGroup(g1);
        project.addGroup(g2);

        task1.closeTask();
//        task2.closeTask();

        System.out.println(project);

    }
}
