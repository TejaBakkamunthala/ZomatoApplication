package com.zomato.app.serviceimpl;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.zomato.app.Entity.User;
import com.zomato.app.common.Pagination;
import com.zomato.app.repository.UserRepository;
import com.zomato.app.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	

	    private final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	    private final UserRepository userRepository;

	    @Autowired
	    public UserServiceImpl(UserRepository userRepository) {
	        this.userRepository = userRepository;
	    }

	    public Page<User> getListOfUsers(User searchedUserObjectInfo, Pagination pagination) {
	        logger.info("Entering into getListOfUsers method");
	        Page<User> listOfUsersToBeReturned = userRepository.findAll(searchCriteriaForUser(searchedUserObjectInfo),
	                pagination.getPageableInstance());
	        return listOfUsersToBeReturned;
	    }

	    public Specification<User> searchCriteriaForUser(User userObject) {
	        logger.info("Entering into searchCriteriaForUser method");
	        return userObject != null ? Specification.where(userObject.getUserName() != null ? containsUserName(userObject.getUserName()) : null)
	                .and(userObject.getUserId() > 0 ? containsUserId(userObject.getUserId()) : null)
	                .and(userObject.getUserEmail() != null ? containsEmail(userObject.getUserEmail()) : null)
	                .and(userObject.getPhoneNumber() != null ? containsPhoneNumber(userObject.getPhoneNumber()) : null) : null;
	    }

	    private Specification<User> containsUserName(String userName) {
	        return (user, criteriaQuery, criteriaBuilder) -> criteriaBuilder.equal(user.get("userName"), userName);
	    }

	    private Specification<User> containsUserId(long userId) {
	        return (user, criteriaQuery, criteriaBuilder) -> criteriaBuilder.equal(user.get("userId"), userId);
	    }

	    private Specification<User> containsEmail(String email) {
	        return (user, criteriaQuery, criteriaBuilder) -> criteriaBuilder.equal(user.get("userEmail"), email);
	    }

	    private Specification<User> containsPhoneNumber(String phoneNumber) {
	        return (user, criteriaQuery, criteriaBuilder) -> criteriaBuilder.like(user.get("phoneNumber"),
	                "%" + phoneNumber + "%");
	    }

	    
	    @Override
	    public User updateUser(User user) {
	        logger.info("Entering into updateUser method");
	        return userRepository.save(user);
	    }

	    @Override
	    public User save(User user) {
	        logger.info("Entering into save method");
	        return userRepository.save(user);
	    }
        
	    @Override
	    public User getUserById(long userId) throws Exception {
	        logger.info("Entering into getUserById method");
	        return userRepository.findById((int) userId)
	                .orElseThrow(() -> new Exception("User for userId = " + userId + " not found"));
	    }

	    @Override
	    public void deleteUserById(long userId) throws Exception {
	        logger.info("Entering into deleteUserById method");

	        if (!userRepository.existsById((int) userId)) {
	            throw new Exception("User for userId = " + userId + " not found");
	        }

	        userRepository.deleteById((int) userId);
	    }
	}

   

