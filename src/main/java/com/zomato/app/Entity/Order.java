package com.zomato.app.Entity;

import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name = "Order" ,schema="zomato")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private int orderId;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "restaurant_id", referencedColumnName = "restaurant_id")
    private Restaurant restaurant;

    @Column(name = "order_date")
    private LocalDateTime orderDate;

    @Column(name = "order_amount")
    private double orderAmount;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}

	public Order(int orderId, User user, Restaurant restaurant, LocalDateTime orderDate, double orderAmount) {
		super();
		this.orderId = orderId;
		this.user = user;
		this.restaurant = restaurant;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
	}
	
	

	public Order() {
		super();
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", user=" + user + ", restaurant=" + restaurant + ", orderDate="
				+ orderDate + ", orderAmount=" + orderAmount + "]";
	}
    
    
   
}
