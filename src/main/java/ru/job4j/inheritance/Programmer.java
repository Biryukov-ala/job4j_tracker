package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private String specialization;

    public Programmer(String name, String surname, String education, String birthday,
                      String institute, String designs, String specialization) {
        super(name, surname, education, birthday, institute, designs);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }
}
