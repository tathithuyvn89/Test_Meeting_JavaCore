package com.veho.model;

import java.util.Date;

public class Meeting {

    private String id;
    private String passcode;
    private String name;
    private String  description;
    private Date  date;
    private String from;
    private String to;
    private String url;

    public Meeting(String id, String passcode, String name,
                   String description, Date date, String from, String to, String url) {
        this.id = id;
        this.passcode = passcode;
        this.name = name;
        this.description = description;
        this.date = date;
        this.from = from;
        this.to = to;
        this.url = url;
    }

    public Meeting() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPasscode() {
        return passcode;
    }

    public void setPasscode(String passcode) {
        this.passcode = passcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
