package com.HibernateJPA;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("per");
        EntityManager em=emf.createEntityManager();
        /*
     em.getTransaction().begin();
        for(int i=1;i<=10;i++)
        {
        Employee employee=new Employee();
        employee.setId(i);
        employee.setName("Name "+i);
        employee.setLap("Lap "+i);
        em.persist(employee);
        
        }
     em.getTransaction().commit();
     */
        Employee employee=em.find(Employee.class,4);
        System.out.println(employee);
    }
}
