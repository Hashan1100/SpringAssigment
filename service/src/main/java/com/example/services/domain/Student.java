package com.example.services.domain;

import org.hibernate.validator.constraints.NotEmpty;
import javax.validation.constraints.Size;

/**
 * Created by hashan on 7/27/17.
 */
public class Student {

    @Size(min = 2, max = 20)
    private String name;

    @NotEmpty
    private String id;

    private String[] gendar;

    private String birthday;

    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String[] getGendar() {
        return gendar;
    }

    public void setGendar(String[] gendar) {
        this.gendar = gendar;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
