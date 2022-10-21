package com.nghia.entity;


public class HealthDeclare {
    private String name;
    private String birthday;
    private String gender;
    private String nationality;
    private String idCard;
    private String travelInfo;
    private String numberVehicle;
    private String numberSeat;
    private String dateStart;
    private String dateEnd;
    private String otherInfo;

    public HealthDeclare() {
    }

    public HealthDeclare(String name, String birthday, String gender, String nationality, String idCard, String travelInfo, String numberVehicle, String numberSeat, String dateStart, String dateEnd, String otherInfo) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.nationality = nationality;
        this.idCard = idCard;
        this.travelInfo = travelInfo;
        this.numberVehicle = numberVehicle;
        this.numberSeat = numberSeat;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.otherInfo = otherInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getTravelInfo() {
        return travelInfo;
    }

    public void setTravelInfo(String travelInfo) {
        this.travelInfo = travelInfo;
    }

    public String getNumberVehicle() {
        return numberVehicle;
    }

    public void setNumberVehicle(String numberVehicle) {
        this.numberVehicle = numberVehicle;
    }

    public String getNumberSeat() {
        return numberSeat;
    }

    public void setNumberSeat(String numberSeat) {
        this.numberSeat = numberSeat;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String otherInfo) {
        this.otherInfo = otherInfo;
    }
}
