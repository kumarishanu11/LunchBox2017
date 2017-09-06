package com.weltec.lunchbox.util;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.weltec.lunchbox.exception.EntityPersistException;



public class DBManager {
	
	public void persistObject(Object obj)throws EntityPersistException{
		EntityManagerFactory emfactory=null;
		EntityManager entitymanager=null;
		
		try{
		  emfactory = Persistence.createEntityManagerFactory( "LunchBoxAplication" );
	      
	      entitymanager = emfactory.createEntityManager( );
	      entitymanager.getTransaction( ).begin( );

	     	      
	      entitymanager.persist( obj );
	      entitymanager.getTransaction( ).commit( );

	      
		}catch(EntityExistsException e){
			throw new EntityPersistException("Requested object already exists");
			
		}catch(Exception e){
			throw new EntityPersistException("Error in persisting object");
		}finally{
			if(entitymanager!=null){
				entitymanager.close( );
			}
			if(emfactory!=null){
		        emfactory.close( );
			}
			
		}
	}
	
	public void updateObject(Object obj)throws EntityPersistException{
		EntityManagerFactory emfactory=null;
		EntityManager entitymanager=null;
		try{
		  emfactory = Persistence.createEntityManagerFactory( "LunchBoxAplication" );
	      
	      entitymanager = emfactory.createEntityManager( );
	      entitymanager.getTransaction( ).begin( );

	     	      
	      entitymanager.merge( obj );
	      entitymanager.getTransaction( ).commit( );

	      entitymanager.close( );
	      emfactory.close( );
		}catch(Exception e){
			throw new EntityPersistException("Error in persisting object");
		}finally{
			if(entitymanager!=null){
				entitymanager.close( );
			}
			if(emfactory!=null){
		        emfactory.close( );
			}
			
		}
	}
	
	public Object getObject(Object obj, String pk)throws EntityPersistException{
		Object entityObject=null;
		EntityManagerFactory emfactory=null;
		EntityManager entitymanager=null;
		try{
			  emfactory = Persistence.createEntityManagerFactory( "LunchBoxAplication" );
		      
		      entitymanager = emfactory.createEntityManager( );
		      
		      		     	      
		      entityObject = entitymanager.find(obj.getClass(), pk);
		      
		      entitymanager.close( );
		      emfactory.close( );
		      return entityObject;
			}catch(Exception e){
				throw new EntityPersistException("Error in getting object");
			}finally{
				if(entitymanager!=null){
					entitymanager.close( );
				}
				if(emfactory!=null){
			        emfactory.close( );
				}
				
			}
		
		
	}

}
