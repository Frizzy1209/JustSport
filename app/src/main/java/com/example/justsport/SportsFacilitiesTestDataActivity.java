package com.example.justsport;

public class SportsFacilitiesTestDataActivity {

    private String name;

    private String address;

    private int sipCode;

    private int distance;

    public SportsFacilitiesTestDataActivity(String name, String address, int sipCode, int distance) {
        this.name = name;
        this.address = address;
        this.sipCode = sipCode;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getSipCode() {
        return sipCode;
    }

    public int getDistance() {
        return distance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSipCode(int sipCode) {
        this.sipCode = sipCode;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "SportsFacilitiesTestDataActivity{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", sipCode=" + sipCode +
                ", distance=" + distance +
                '}';
    }
}
