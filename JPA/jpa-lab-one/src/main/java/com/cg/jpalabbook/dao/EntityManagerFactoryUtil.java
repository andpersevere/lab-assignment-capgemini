/**
 * 
 */
package com.cg.jpalabbook.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author OSIS
 *
 */
public class EntityManagerFactoryUtil {
	private static EntityManagerFactory entityManagerFactory;
	
	private EntityManagerFactoryUtil() {}
	public static EntityManagerFactory getEntityManagerFactory() {
		if(entityManagerFactory==null) {
			entityManagerFactory=Persistence.createEntityManagerFactory("jdbclabbook");
		}
		return entityManagerFactory;
	}
	public static void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		
		EntityManagerFactoryUtil.entityManagerFactory = entityManagerFactory;
	}
}
