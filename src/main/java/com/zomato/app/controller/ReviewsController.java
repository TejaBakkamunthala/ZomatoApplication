package com.zomato.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zomato.app.Entity.Reviews;
import com.zomato.app.service.ReviewsService;

@RestController
@RequestMapping("/reviews")
public class ReviewsController {

    @Autowired
    private ReviewsService reviewsService;

    @GetMapping
    public List<Reviews> getAllReviews() {
        return reviewsService.getAllReviews();
    }

    @GetMapping("/{reviewId}")
    public Reviews getReviewById(@PathVariable int reviewId) {
        return reviewsService.getReviewsById(reviewId);
    }

    @PostMapping
    public Reviews createReview(@RequestBody Reviews review) {
        return reviewsService.createReviews(review);
    }

    @PutMapping("/{reviewId}")
    public Reviews updateReview(@PathVariable int reviewId, @RequestBody Reviews review) {
        Reviews existingReview = reviewsService.getReviewsById(reviewId);
        if (existingReview == null) {
            // Handle not found scenario or return a specific response
            return null;
        }
        review.setReviewId(reviewId);
        return reviewsService.updateReviews(review);
    }

    @DeleteMapping("/{reviewId}")
    public void deleteReview(@PathVariable int reviewId) {
        reviewsService.deleteReviews(reviewId);
    }
}
