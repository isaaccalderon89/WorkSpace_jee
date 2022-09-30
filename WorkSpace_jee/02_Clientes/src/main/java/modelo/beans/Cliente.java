package modelo.beans;

import java.io.Serializable;
import java.util.Objects;

public class Cliente implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username, password;

	//Constructor con parametros 
	public Cliente(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	//Constructor sin parametros
	public Cliente() {
		super();
	}

	//Creamos Getters and Setters
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	//Generamos toString
	@Override
	public String toString() {
		return "Cliente [username=" + username + ", password=" + password + "]";
	}
	//Generamos hasCode
	@Override
	public int hashCode() {
		return Objects.hash(username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Cliente))
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(username, other.username);
	}
	
	
	

}
