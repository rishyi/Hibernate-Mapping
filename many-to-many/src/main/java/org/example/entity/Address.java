package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Address {

    @Id
    private int aid;
    private String no;
    private String road;
    private String city;

    @ManyToMany(mappedBy = "addresses")
    private List<Customer> customers;

    public Address(int aid, String no, String road, String city, List<Customer> customers) {
        this.aid = aid;
        this.no = no;
        this.road = road;
        this.city = city;
        this.customers = customers;
    }


    public Address() {

    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
