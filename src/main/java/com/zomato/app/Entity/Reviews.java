package com.zomato.app.Entity;

import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name = "Reviews" ,schema="zomato")
public class Reviews {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_id")
    private int reviewId;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "restaurant_id", referencedColumnName = "restaurant_id")
    private Restaurant restaurant;

    @Column(name = "review_text", columnDefinition = "TEXT")
    private String reviewText;

    @Column(name = "rating")
    private double rating;

    @Column(name = "review_date")
    private LocalDateTime reviewDate;

	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
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

	public String getReviewText() {
		return reviewText;
	}

	public void setReviewText(String reviewText) {
		this.reviewText = reviewText;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public LocalDateTime getReviewDate() {
		return reviewDate;
	}

	public void setReviewDate(LocalDateTime reviewDate) {
		this.reviewDate = reviewDate;
	}

	public Reviews(int reviewId, User user, Restaurant restaurant, String reviewText, double rating,
			LocalDateTime reviewDate) {
		super();
		this.reviewId = reviewId;
		this.user = user;
		this.restaurant = restaurant;
		this.reviewText = reviewText;
		this.rating = rating;
		this.reviewDate = reviewDate;
	}

	public Reviews() {
		super();
	}

	@Override
	public String toString() {
		return "Reviews [reviewId=" + reviewId + ", user=" + user + ", restaurant=" + restaurant + ", reviewText="
				+ reviewText + ", rating=" + rating + ", reviewDate=" + reviewDate + "]";
	}

    
    
}
