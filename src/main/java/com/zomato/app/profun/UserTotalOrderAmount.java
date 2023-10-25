package com.zomato.app.profun;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class UserTotalOrderAmount {

    @Id
    private Long userId; // Assuming user_id is of type Long.

    private BigDecimal totalAmount;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public UserTotalOrderAmount(Long userId, BigDecimal totalAmount) {
		super();
		this.userId = userId;
		this.totalAmount = totalAmount;
	}

	public UserTotalOrderAmount() {
		super();
	}

	@Override
	public String toString() {
		return "UserTotalOrderAmount [userId=" + userId + ", totalAmount=" + totalAmount + "]";
	}

    // Constructors, getters, setters, etc.
    
    
}

