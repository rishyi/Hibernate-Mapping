package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer {

    @Id
    private String cid;
    private String name;

    @OneToMany(mappedBy = "customer")
    private List<Address> addresses;

    public Customer() {

    }

    public Customer(String cid, String name, List<Address> addresses) {
        this.cid = cid;
        this.name = name;
        this.addresses = addresses;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
}
