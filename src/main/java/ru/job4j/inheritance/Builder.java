package ru.job4j.inheritance;

public class Builder extends Engineer {
    private String specialization;

    public String getSpecialization() {
        return specialization;
    }

    public boolean designsBuildings(Customer customer) {
        return true;
    }
}
