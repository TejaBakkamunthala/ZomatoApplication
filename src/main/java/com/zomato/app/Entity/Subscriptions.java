package com.zomato.app.Entity;

import javax.persistence.*;

@Entity
@Table(name = "Subscriptions",schema="zomato")
public class Subscriptions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subscription_id")
    private int subscriptionId;

    @Column(name = "subscription_name")
    private String subscriptionName;

    @Column(name = "subscription_price")
    private int subscriptionPrice;

	public int getSubscriptionId() {
		return subscriptionId;
	}

	public void setSubscriptionId(int subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	public String getSubscriptionName() {
		return subscriptionName;
	}

	public void setSubscriptionName(String subscriptionName) {
		this.subscriptionName = subscriptionName;
	}

	public int getSubscriptionPrice() {
		return subscriptionPrice;
	}

	public void setSubscriptionPrice(int subscriptionPrice) {
		this.subscriptionPrice = subscriptionPrice;
	}

	public Subscriptions(int subscriptionId, String subscriptionName, int subscriptionPrice) {
		super();
		this.subscriptionId = subscriptionId;
		this.subscriptionName = subscriptionName;
		this.subscriptionPrice = subscriptionPrice;
	}

	
	public Subscriptions() {
		super();
	}

	
	
	@Override
	public String toString() {
		return "Subscriptions [subscriptionId=" + subscriptionId + ", subscriptionName=" + subscriptionName
				+ ", subscriptionPrice=" + subscriptionPrice + "]";
	}

    
    
}
