package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private String specialization;

    public String getSpecialization() {
        return specialization;
    }

    public boolean designsProgramms(Customer customer) {
        return true;
    }
}
