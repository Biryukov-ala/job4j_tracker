package ru.job4j.inheritance;

public class Engineer extends Profession {
    private String institute;
    private String designs;

    public Engineer(String name, String surname, String education, String birthday,
                    String institute, String designs) {
        super(name, surname, education, birthday);
        this.institute = institute;
        this.designs = designs;
    }

    public String getInstitute() {
        return institute;
    }

    public String getDesigns() {
        return designs;
    }
}
