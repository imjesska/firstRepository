package main.src;

import main.src.dao.TeachingStaff;
import main.src.util.JpaUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class MainRunner {
    public static void main(String[] args) {
/*
        EmployeeService es = new EmployeeService();
        Employee e = new Employee("Jafer", 2000.00, "E-Commerce");
        es.createEmp(e);

 */

        EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        TeachingStaff ts = new TeachingStaff(1, "jafer", "h","hh");
        NonTeachingStaff ns = new NonTeachingStaff(2,"Tim","Java");
        em.persist(ts);
        em.persist(ns);

        em.getTransaction().commit();
        em.close();
    }
}