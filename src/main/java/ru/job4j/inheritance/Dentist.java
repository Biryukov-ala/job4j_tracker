package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private String specialization;

    public String getSpecialization() {
        return specialization;
    }

    public boolean healsTeeth(Pacient customer) {
        return true;
    }
}
