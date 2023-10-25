package com.zomato.app.Entity;

import javax.persistence.*;

@Entity
@Table(name ="UserSubscriptions",schema="zomato")
public class UserSubscriptions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_subscription_id")
    private int userSubscriptionId;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "subscription_id", referencedColumnName = "subscription_id")
    private Subscriptions subscription;

	public int getUserSubscriptionId() {
		return userSubscriptionId;
	}

	public void setUserSubscriptionId(int userSubscriptionId) {
		this.userSubscriptionId = userSubscriptionId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Subscriptions getSubscription() {
		return subscription;
	}

	public void setSubscription(Subscriptions subscription) {
		this.subscription = subscription;
	}

	public UserSubscriptions(int userSubscriptionId, User user, Subscriptions subscription) {
		super();
		this.userSubscriptionId = userSubscriptionId;
		this.user = user;
		this.subscription = subscription;
	}

	
	public UserSubscriptions() {
		super();
	}

	@Override
	public String toString() {
		return "UserSubscriptions [userSubscriptionId=" + userSubscriptionId + ", user=" + user + ", subscription="
				+ subscription + "]";
	}

    
    
}
