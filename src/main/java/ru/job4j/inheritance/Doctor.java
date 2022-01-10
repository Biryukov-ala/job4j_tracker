package ru.job4j.inheritance;

public class Doctor extends Profession {
    private String hospital;
    private String diagnosis;

    public Doctor() {
    }

    public String getHospital() {
        return hospital;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

}
