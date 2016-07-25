package com.test.createactors;

/**
 * Created by Jon Kim on 7/25/16.
 */
public class Actor {
    String name, dob;
    int oscars;

    public Actor(String name, String dob, int oscars) {
        this.name = name;
        this.dob = dob;
        this.oscars = oscars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getOscars() {
        return oscars;
    }

    public void setOscars(int oscars) {
        this.oscars = oscars;
    }
}
