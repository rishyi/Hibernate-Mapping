package org.example;

import org.example.config.FactoryConfiguration;
import org.example.entity.Address;
import org.example.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Customer> customerArrayList = new ArrayList<>();
        ArrayList<Address> addressArrayList = new ArrayList<>();

//        Customer 1
        Customer customer1 = new Customer();
        customer1.setCid(1);
        customer1.setName("Rew");
        customerArrayList.add(customer1);
        customer1.setAddresses(addressArrayList);

//        Customer 2
        Customer customer2 = new Customer();
        customer2.setCid(2);
        customer2.setName("Rew");
        customerArrayList.add(customer2);
        customer2.setAddresses(addressArrayList);

//        Address 1
        Address address1 = new Address();
        address1.setAid(1);
        address1.setNo("NO3");
        address1.setRoad("Old");
        address1.setCity("kalutara");
        address1.setCustomers(customerArrayList);
        addressArrayList.add(address1);

//          Address 2
        Address address2 = new Address();
        address2.setAid(2);
        address2.setNo("NO4");
        address2.setRoad("wrd");
        address2.setCity("kolba");
        address2.setCustomers(customerArrayList);
        addressArrayList.add(address2);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.save(address1);
        session.save(address2);
        session.save(customer1);
        session.save(customer2);
        transaction.commit();
        session.close();
    }
}
