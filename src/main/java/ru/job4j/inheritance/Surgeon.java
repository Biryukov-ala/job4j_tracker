package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private String specialization;

    public Surgeon(String specialization,
                   String name,
                   String surname,
                   String education,
                   String birthday) {
        super();
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public boolean cutBody(Pacient customer) {
        return true;
    }
}
