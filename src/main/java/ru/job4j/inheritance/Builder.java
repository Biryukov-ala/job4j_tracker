package ru.job4j.inheritance;

public class Builder extends Engineer {
    private String specialization;

    public Builder(String specialization,
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

    public boolean designsBuildings(Customer customer) {
        return true;
    }
}
