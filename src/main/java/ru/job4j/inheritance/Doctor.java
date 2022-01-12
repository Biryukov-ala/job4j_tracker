package ru.job4j.inheritance;

public class Doctor extends Profession {
    private String hospital;
    private String diagnosis;

    public Doctor(String name, String surname, String education, String birthday,
                  String hospital, String diagnosis) {
        super(name, surname, education, birthday);
        this.hospital = hospital;
        this.diagnosis = diagnosis;
    }

    public String getHospital() {
        return hospital;
    }

    public String getDiagnosis() {
        return diagnosis;
    }
}
