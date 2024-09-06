package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity

public class Address {

    @Id
    private int aId;
    private String no;
    private String city;
    private String road;

    @OneToOne
    private Customer customer;
//    Customer table eke id eka address table eke column ehekta foreign key karanwa

    public Address(int aId, String no, String city, String road, Customer customer) {
        this.aId = aId;
        this.no = no;
        this.city = city;
        this.road = road;
        this.customer = customer;
    }

    public Address() {

    }

    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
