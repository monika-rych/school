package com.rych.school.domain;

public class Address {

    private String id;
    private String street;
    private int homeNumber;
    private int flatNumber;
    private String city;

    public Address(String id, String street, int homeNumber, int flatNumber, String city) {
        this.id = id;
        this.street = street;
        this.homeNumber = homeNumber;
        this.flatNumber = flatNumber;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id='" + id + '\'' +
                ", street='" + street + '\'' +
                ", homeNumber=" + homeNumber +
                ", flatNumber=" + flatNumber +
                ", city='" + city + '\'' +
                '}';
    }
}
