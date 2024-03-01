package com.ams.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the users table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="users"
 */

public abstract class BaseLogin  implements Serializable {

	public static String REF = "Login";
	public static String PROP_USERNAME = "Username";
	public static String PROP_PASSWORD = "Password";


	// constructors
	public BaseLogin () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseLogin (long id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private long id;

	// fields
	private java.lang.String username;
	private java.lang.String password;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="sequence"
     *  column="id_user"
     */
	public long getId () {
		return id;
	}

	/**
	 * Set the unique identifier of this class
	 * @param id the new ID
	 */
	public void setId (long id) {
		this.id = id;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: username
	 */
	public java.lang.String getUsername () {
		return username;
	}

	/**
	 * Set the value related to the column: username
	 * @param username the username value
	 */
	public void setUsername (java.lang.String username) {
		this.username = username;
	}



	/**
	 * Return the value associated with the column: password
	 */
	public java.lang.String getPassword () {
		return password;
	}

	/**
	 * Set the value related to the column: password
	 * @param password the password value
	 */
	public void setPassword (java.lang.String password) {
		this.password = password;
	}





	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.ams.model.Login)) return false;
		else {
			com.ams.model.Login login = (com.ams.model.Login) obj;
			return (this.getId() == login.getId());
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			return (int) this.getId();
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}