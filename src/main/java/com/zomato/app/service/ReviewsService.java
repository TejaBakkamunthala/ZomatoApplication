package com.zomato.app.service;

import java.util.List;

import com.zomato.app.Entity.Reviews;

public interface ReviewsService {
    List<Reviews> getAllReviews();
    Reviews getReviewsById(int reviewId);
    Reviews createReviews(Reviews reviews);
    Reviews updateReviews(Reviews reviews);
    void deleteReviews(int reviewId);
}
