package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private String specialization;

    public Programmer(String specialization,
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

    public boolean designsProgramms(Customer customer) {
        return true;
    }
}
