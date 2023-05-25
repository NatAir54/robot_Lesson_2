package com.ua.robot.hw40;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(City.class)
                .addAnnotatedClass(Country.class)
                .buildSessionFactory();

        Session session = null;

        try {

            session = factory.getCurrentSession();
            Country country = new Country();
            country.setName("Ukraine");
            List<City> list = List.of(new City("Kharkiv", country), new City("Kiyv", country), new City("Lviv", country), new City("Dnipro", country));
            country.setCities(list);
            session.beginTransaction();
            session.save(country);
            session.getTransaction().commit();
            System.out.println(country);

            session = factory.getCurrentSession();
            Country country2 = new Country();
            country2.setName("England");
            List<City> list2 = List.of(new City("London", country2), new City("Manchester", country2), new City("Liverpool", country2), new City("Birmingham", country2));
            country2.setCities(list2);
            session.beginTransaction();
            session.save(country2);
            session.getTransaction().commit();
            System.out.println(country2);

        }  finally {
            factory.close();
            if (session != null) {
                session.close();
            }
        }
    }
}