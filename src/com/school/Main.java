package com.school;

public class Main {
    public static void main(String[] args) {
        School school = new School();

        school.addMember(new Teacher("Severus", "Snape", 51, true, "Math", 7, 800000));
        school.addMember(new Teacher("Albus", "Dumbledore", 71, true, "Philosophy", 25, 1500000));
        school.addMember(new Teacher("Minerva", "McGonagall", 62, false, "Sociology", 17, 1100000));

        Student harry = new Student("Harry", "Potter", 21, true);
        harry.addGrade(78);
        harry.addGrade(89);
        harry.addGrade(99);
        school.addMember(harry);

        Student hermione = new Student("Hermione", "Granger", 19, false);
        hermione.addGrade(100);
        hermione.addGrade(99);
        hermione.addGrade(95);
        school.addMember(hermione);

        System.out.println(school);

        System.out.println("Hermione's GPA: " + hermione.calculateGPA());
        Teacher minerva = (Teacher) school.members.get(2);
        minerva.giveRaise(10);
        System.out.println("Minerva's new salary: " + minerva.salary);
    }
}
