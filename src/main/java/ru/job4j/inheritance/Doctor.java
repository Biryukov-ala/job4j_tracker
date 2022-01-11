package ru.job4j.inheritance;

public class Doctor extends Profession {
    private String hospital;
    private String diagnosis;

    public Doctor() {

    }

    public Doctor(String hospital, String diagnosis,
                  String name,
                  String surname,
                  String education,
                  String birthday) {
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
