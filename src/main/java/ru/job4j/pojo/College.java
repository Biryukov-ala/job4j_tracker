package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Alexnader Biryukov");
        student.setGroup("JavaProgramming");
        student.setAdmissioDate(new Date());
        System.out.println(student.getFullName() + " learning in " + student.getGroup()
                + " group since " + student.getAdmissioDate());
    }
}
