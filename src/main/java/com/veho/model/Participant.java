package com.veho.model;

import com.veho.model.Meeting;

import java.util.List;

public class Participant {

    private String email;
    private String name;
    private String company;
    private String position;
    private List<Meeting> meetings;

    public Participant(String email, String name, String company, String position, List<Meeting> meetings) {
        this.email = email;
        this.name = name;
        this.company = company;
        this.position = position;
        this.meetings = meetings;
    }

    public Participant() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public List<Meeting> getMeetings() {
        return meetings;
    }

    public void setMeetings(List<Meeting> meetings) {
        this.meetings = meetings;
    }
}
