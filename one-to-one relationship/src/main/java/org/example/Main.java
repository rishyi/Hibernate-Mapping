package org.example;

import org.example.config.FactoryConfiguration;
import org.example.entity.Address;
import org.example.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {

       Customer customer = new Customer();
       customer.setId("C001");
       customer.setName("Kevin");

       Address address = new Address();
       address.setaId(1);
       address.setNo("No:4");
       address.setRoad("parana");
       address.setCity("kalutara");
       address.setCustomer(customer);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction =session.beginTransaction();
        session.save(customer);
        session.save(address);
        transaction.commit();
        session.close();

    }
}