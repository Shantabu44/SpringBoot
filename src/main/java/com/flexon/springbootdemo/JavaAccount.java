package com.flexon.springbootdemo;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity

public class JavaAccount {

@Id
	private String name;

	private String email;
	private String dob;
	private String gender;
	private String password;

	/*	private int dobDate;
        private int dobMonth;
        private int dobYear;	*/
	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getDob() {
		return dob;
	}

	public String getGender() {
		return gender;
	}

	public String getPassword() {
		return password;
	}

	/*	public int getDobDate() {
          return dobDate;
        }
        public int getDobMonth() {
          return dobMonth;
        }
        public int getDobYear() {
          return dobYear;
        }*/
	public void setName(String newName) {
		if (!newName.matches(".*\\d.*")) {
			name = newName;
		} else {
			System.out.println("Invalid Name");
		}
	}

	public void setEmail(String newEmail) {
		String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		if (newEmail.matches(regex)) {
			email = newEmail;
		} else {
			System.out.println("Invalid Email");
		}
	}

	public void setDob(String newDob) {
		dob = newDob;
	}

	public void setGender(String newGender) {
		gender = newGender;
	}

	public void setPassword(String newPassword) {
		if (newPassword.length() > 5) {
			password = newPassword;
		} else {
			System.out.println("Invalid Password");
		}
	}

	public void user(String name, String email, String dob, String gender, String password) {
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.gender = gender;
		this.password = password;
	}

	public String toString() {
		return "JAVAAccount [name=" + name + ", email=" + email + ", dob="
				+ dob + ", gender=" + gender + ", password=" + password + "]";
	}

}

