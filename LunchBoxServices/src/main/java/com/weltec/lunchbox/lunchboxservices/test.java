package com.weltec.lunchbox.lunchboxservices;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Admin;


public class test {

   public static void main( String[ ] args ) {
   
      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "LunchBoxAplication" );
      
      EntityManager entitymanager = emfactory.createEntityManager( );
      entitymanager.getTransaction( ).begin( );

      Admin admin = new Admin( ); 
      admin.setAdminId("admin1");
      admin.setPassword("admin1");
      admin.setEmailId("admin1@email");
      admin.setStartDate(new Date());
      admin.setContactNumber("12345");
      admin.setFirstName("adminNAme");
      admin.setLastName("lastname");
      
      
      entitymanager.persist( admin );
      entitymanager.getTransaction( ).commit( );

      entitymanager.close( );
      emfactory.close( );
   }
}

