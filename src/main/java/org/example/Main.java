package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("UnidadMySQL");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        //Insercion
        Director dir = new Director("12345678X", "Pedro", "Gonzalez", 35, "123456789", null);
        Direccion dr = new Direccion("Av. Rivadavia", 1234, "12345", null);
        Cine cine = new Cine("Yelmo Cines Bahia Sur", dr, 700, dir);
        em.persist(dir);
        em.persist(dr);
        em.persist(cine);

        em.getTransaction().commit();
        //em.close();

        //Consulta
        Cine cineBusqueda = em.find(Cine.class, 1);
        System.out.println(cineBusqueda.getNombre());
        System.out.println(cineBusqueda.getDireccion().getCalle());
    }
}