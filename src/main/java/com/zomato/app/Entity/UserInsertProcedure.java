package com.zomato.app.Entity;

import javax.persistence.*;


public class UserInsertProcedure {
   
   
    private String user_name1;

    private String user_email1;

    private String user_password1;

    private String first_name1;

    private String last_name1;

    private String phone_number1;

    private boolean active_user1;

	public String getUser_name1() {
		return user_name1;
	}

	public void setUser_name1(String user_name1) {
		this.user_name1 = user_name1;
	}

	public String getUser_email1() {
		return user_email1;
	}

	public void setUser_email1(String user_email1) {
		this.user_email1 = user_email1;
	}

	public String getUser_password1() {
		return user_password1;
	}

	public void setUser_password1(String user_password1) {
		this.user_password1 = user_password1;
	}

	public String getFirst_name1() {
		return first_name1;
	}

	public void setFirst_name1(String first_name1) {
		this.first_name1 = first_name1;
	}

	public String getLast_name1() {
		return last_name1;
	}

	public void setLast_name1(String last_name1) {
		this.last_name1 = last_name1;
	}

	public String getPhone_number1() {
		return phone_number1;
	}

	public void setPhone_number1(String phone_number1) {
		this.phone_number1 = phone_number1;
	}

	public boolean isActive_user1() {
		return active_user1;
	}

	public void setActive_user1(boolean active_user1) {
		this.active_user1 = active_user1;
	}

	public UserInsertProcedure(String user_name1, String user_email1, String user_password1, String first_name1,
			String last_name1, String phone_number1, boolean active_user1) {
		super();
		this.user_name1 = user_name1;
		this.user_email1 = user_email1;
		this.user_password1 = user_password1;
		this.first_name1 = first_name1;
		this.last_name1 = last_name1;
		this.phone_number1 = phone_number1;
		this.active_user1 = active_user1;
	}

	public UserInsertProcedure() {
		super();
	}

	@Override
	public String toString() {
		return "UserInsertProcedure [user_name1=" + user_name1 + ", user_email1=" + user_email1 + ", user_password1="
				+ user_password1 + ", first_name1=" + first_name1 + ", last_name1=" + last_name1 + ", phone_number1="
				+ phone_number1 + ", active_user1=" + active_user1 + "]";
	}

		
    

}