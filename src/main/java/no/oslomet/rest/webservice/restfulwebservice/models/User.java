package no.oslomet.rest.webservice.restfulwebservice.models;

import java.util.Date;

public class User {

    private  Integer id;
    private final String name;
    private final Date birthdate;

    public User(int id, String name, Date birthdate) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Date getBirthdate() {
        return birthdate;
    }
}
