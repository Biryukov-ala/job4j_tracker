package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private String specialization;

    public Dentist(String specialization,
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

    public boolean healsTeeth(Pacient customer) {
        return true;
    }
}
