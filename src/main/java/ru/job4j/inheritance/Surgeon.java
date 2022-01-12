package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private String specialization;

    public Surgeon(String name, String surname, String education, String birthday,
                   String hospital, String diagnosis, String specialization) {
        super(name, surname, education, birthday, hospital, diagnosis);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }
}
