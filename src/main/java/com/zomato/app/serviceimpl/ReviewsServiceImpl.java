package com.zomato.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zomato.app.Entity.Reviews;
import com.zomato.app.repository.ReviewsRepository;
import com.zomato.app.service.ReviewsService;

@Service
public class ReviewsServiceImpl implements ReviewsService {

    @Autowired
    private ReviewsRepository reviewsRepository;

    @Override
    public List<Reviews> getAllReviews() {
        return reviewsRepository.findAll();
    }

    @Override
    public Reviews getReviewsById(int reviewId) {
        return reviewsRepository.findById(reviewId).orElse(null);
    }

    @Override
    public Reviews createReviews(Reviews reviews) {
        return reviewsRepository.save(reviews);
    }

    @Override
    public Reviews updateReviews(Reviews reviews) {
        return reviewsRepository.save(reviews);
    }

    @Override
    public void deleteReviews(int reviewId) {
        reviewsRepository.deleteById(reviewId);
    }
}
