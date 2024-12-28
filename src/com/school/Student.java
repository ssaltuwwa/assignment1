package com.school;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private static int idCounter = 1000;
    private int studentID;
    private List<Integer> grades;

    public Student(String name, String surname, int age, boolean gender) {
        super(name, surname, age, gender);
        this.studentID = idCounter++;
        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double calculateGPA() {
        if (grades.isEmpty()) return 0.0;
        int sum = grades.stream().mapToInt(Integer::intValue).sum();
        return sum / (double) grades.size();
    }

    @Override
    public String toString() {
        return super.toString() + " I am a student with ID " + studentID + ".";
    }
}
