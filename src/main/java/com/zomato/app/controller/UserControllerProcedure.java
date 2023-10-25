package com.zomato.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zomato.app.Entity.UserInsertProcedure;
import com.zomato.app.serviceimpl.UserServiceProcedure;

@RestController
@RequestMapping("/user")
public class UserControllerProcedure {

	@Autowired
    private  UserServiceProcedure userServiceProcedure;

    

   @PostMapping("/insert")
    public ResponseEntity<String> insertUser(@RequestBody UserInsertProcedure userInsertProcedure) {
        String user_name1  = userInsertProcedure.getUser_name1();
        String user_mail1  = userInsertProcedure.getUser_email1();
        String user_password1  = userInsertProcedure.getUser_password1();
        String first_name1  = userInsertProcedure.getFirst_name1();
        String last_name1  = userInsertProcedure.getLast_name1();
        String phone_number1  = userInsertProcedure.getPhone_number1();
        boolean active_user1  = userInsertProcedure.isActive_user1();
        
        System.out.println(userInsertProcedure.getFirst_name1());

        userServiceProcedure.insertUser(user_name1, user_mail1, user_password1,first_name1,last_name1,phone_number1,active_user1);
        return ResponseEntity.ok("Order booked successfully");
    }
}