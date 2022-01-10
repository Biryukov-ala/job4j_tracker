package ru.job4j.inheritance;

public class Profession {

    private String name;
    private String surname;
    private String education;
    private String birthday;

    public Profession() {
    }

    public String getName() {
        this.name = name;
        return name;
    }

    public String getSurname() {
        this.surname = surname;
        return surname;
    }

    public String getEducation() {
        this.education = education;
        return education;
    }

    public String getBirthday() {
        this.birthday = birthday;
        return birthday;
    }

}
