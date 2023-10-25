package com.zomato.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zomato.app.Entity.User;
import com.zomato.app.common.Pagination;
import com.zomato.app.serviceimpl.UserServiceImpl;

@RestController

public class UserController {

    private final Logger logger = LoggerFactory.getLogger(UserController.class);

    private final UserServiceImpl userService;

    @Autowired
    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public Page<User> getListOfUsers(
            @RequestParam(value = "body", defaultValue = "{}") String body,
            @RequestParam(value = "pageNo", defaultValue = "0") int pageNo,
            @RequestParam(value = "recordPerPage", defaultValue = "100") int recordPerPage,
            @RequestParam(value = "sortKey", defaultValue = "userId") String sortKey,
            @RequestParam(value = "sortDir", defaultValue = "asc") String sortDir
    ) throws JsonMappingException, JsonProcessingException {

        logger.info("Entering into getListOfUsers method");

        ObjectMapper userObjectMapper = new ObjectMapper();
        
        User searchedUserObjectInfo = userObjectMapper.readValue(body, User.class);

        Pagination pagination = new Pagination(pageNo, recordPerPage, sortDir, sortKey);

        Page<User> users = userService.getListOfUsers(searchedUserObjectInfo, pagination);

		return users;
    }

    @GetMapping("/users/{userId}")
    public User getUserById(@PathVariable Long userId) throws Exception {
        logger.info("Entering into getUserById method");
        return userService.getUserById(userId);
    }

    @PostMapping("/users")
    public User saveUser(@RequestBody User user) {
        logger.info("Entering into saveUser method");
        return userService.save(user);
    }

    @DeleteMapping("/users/{userId}")
    public void deleteUser(@PathVariable Long userId) throws Exception {
        logger.info("Entering into deleteUser method");
        userService.deleteUserById(userId);
    }
}
