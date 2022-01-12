package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private String specialization;

    public Dentist(String name, String surname, String education, String birthday,
                   String hospital, String diagnosis, String specialization) {
        super(name, surname, education, birthday, hospital, diagnosis);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }
}
