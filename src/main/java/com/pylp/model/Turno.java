package com.pylp.model;

public class Turno {
    private String id;
    private String specialist;
    private String userAssigned;
    private String date;
    private String status;

    // Getters y Setters

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setUserAssigned(String userAssigned) {
        this.userAssigned = userAssigned;
    }

    public String getUserAssigned() {
        return userAssigned;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
    
}
