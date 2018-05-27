/**
 * 
 */
package com.practice.usermodel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Chetan Gudisagar
 *
 */
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ID;
	private String keyw;
	private String value;

	public User(String keyw, String value) {
		this.keyw = keyw;
		this.value = value;

	}

	public int getID() {
		return ID;
	}

	@Override
	public String toString() {
		return "User [ID=" + ID + ", key=" + keyw + ", value=" + value + "]";
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getKey() {
		return keyw;
	}

	public void setKey(String keyw) {
		this.keyw = keyw;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
