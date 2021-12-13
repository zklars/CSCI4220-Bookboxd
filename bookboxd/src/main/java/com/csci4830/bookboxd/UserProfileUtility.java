package com.csci4830.bookboxd;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class UserProfileUtility {
	static SessionFactory sessionFactory = null;

	/**
	 * Returns the SessionFactory object for this Hibernate configuration.
	 * 
	 * @return The SessionFactory object.
	 */
	public static SessionFactory getSessionFactory() {
		if (sessionFactory != null) {
			return sessionFactory;
		}

		// New versions of Hibernate don't like the code given in class and is
		// considered deprecated.
		// Source for this code:
		// https://stackoverflow.com/questions/33005348/hibernate-5-org-hibernate-mappingexception-unknown-entity

		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();

		return metadata.getSessionFactoryBuilder().build();
	}
	
	/**
	 * TODO: update the about me section
	 * @param user_id User whose about me is being updated
	 * @param comments New about me section
	 * note that the about me can only be as long as mysql can hold
	 * @return success code
	 */
	public static Integer updateAboutMe(Integer user_id, String comments) {
		return null;
	}
	
	/**
	 * TODO: change a user's profile privacy
	 * @param user_id User making changes
	 * @param new_privacy_setting
	 * @return success code
	 */
	public static Integer changeProfilePrivacy(Integer user_id, Integer new_privacy_setting) {
		return null;
	}
	
	/**
	 * TODO: change a list's privacy setting
	 * @param user_id
	 * @param list_id
	 * @param new_privacy_setting
	 * @return
	 */
	public static Integer changeListPrivacy(Integer user_id, Integer list_id, Integer new_privacy_setting) {
		return null;
	}
	
	/**
	 * TODO: get the privacy setting of a user's profile
	 * @param user_id
	 * @param privacy_setting
	 * @return The current privacy setting of a user's profile
	 */
	public static Integer getProfilePrivacy(Integer user_id, Integer privacy_setting) {
		return null;
	}
	
	
}