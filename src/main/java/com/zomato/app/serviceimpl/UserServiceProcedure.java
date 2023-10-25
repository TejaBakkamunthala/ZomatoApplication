package com.zomato.app.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserServiceProcedure {

	
	private JdbcTemplate jdbcTemplate;
	
	

	@Autowired
	public UserServiceProcedure(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}




	public void insertUser(String user_name1, String user_email1, String user_password1, String first_name1,
			String last_name1, String phone_number1, boolean active_user1) {
		jdbcTemplate.update("CALL zomato.insert_user_procedure(?, ?, ?, ?, ?, ?, ?)", user_name1, user_email1,
				user_password1, first_name1, last_name1, phone_number1, active_user1);
	}

}
