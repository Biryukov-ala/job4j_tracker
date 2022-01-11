package ru.job4j.inheritance;

public class Engineer extends Profession {
    private String institute;
    private String designs;

    public Engineer() {

    }

    public Engineer(String institute,
                    String designs,
                    String name,
                    String surname,
                    String education,
                    String birthday) {
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
