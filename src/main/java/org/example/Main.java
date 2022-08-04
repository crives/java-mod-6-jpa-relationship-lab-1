package org.example;

import org.example.models.Capital;
import org.example.models.Country;

import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class Main {
    public static void main(String[] args) {
        // create country instances
        Country country1 = new Country();
        country1.setName("UK");

        Country country2 = new Country();
        country2.setName("Ireland");

        // create capital instances
        Capital capital1 = new Capital();
        capital1.setName("London");

        Capital capital2 = new Capital();
        capital2.setName("Dublin");

        // create country-capital associations
        country1.setCapital(capital1);
        country2.setCapital(capital2);

        // create EntityManager
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("example");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // access transaction object
        EntityTransaction transaction = entityManager.getTransaction();

        // create and use transactions
        transaction.begin();
        entityManager.persist(country1);
        entityManager.persist(country2);

        entityManager.persist(capital1);
        entityManager.persist(capital2);

        entityManager.persist(country1);
        entityManager.persist(country2);

        // close entity manager
        entityManager.close();
        entityManagerFactory.close();
    }
}