package org.example;

import org.example.config.FactoryConfiguration;
import org.example.entity.Address;
import org.example.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Address> addressList = new ArrayList<>();

        Customer customer = new Customer();
        customer.setCid("C001");
        customer.setName("Nas");
        customer.setAddresses(addressList);

        Address address1 = new Address();
        address1.setCustomer(customer);
        address1.setAid(1);
        address1.setNo("NO4");
        address1.setRoad("parana");
        address1.setCity("Kalutara");
        addressList.add(address1);

        Address address2 = new Address();
        address2.setCustomer(customer);
        address2.setAid(2);
        address2.setNo("NO6");
        address2.setRoad("parana");
        address2.setCity("kolaba");
        addressList.add(address2);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.save(customer);
        session.save(address1);
        session.save(address2);
        transaction.commit();
        session.close();
    }
}
