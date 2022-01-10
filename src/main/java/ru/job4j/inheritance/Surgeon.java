package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private String specialization;

    public String getSpecialization() {
        return specialization;
    }

    public boolean cutBody(Pacient customer) {
        return true;
    }
}
