package com.calorigo.service.impl;

import com.calorigo.model.Review;
import com.calorigo.repository.ReviewRepository;
import com.calorigo.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    @Override
    public Review addReview(Review review) {
        return reviewRepository.save(review);
    }

    @Override
    public List<Review> getReviewsForFoodItem(Long foodItemId) {
        return reviewRepository.findByFoodItemId(foodItemId);
    }

    @Override
    public List<Review> getReviewsForRestaurant(Long restaurantId) {
        return reviewRepository.findByRestaurantId(restaurantId);
    }

    @Override
    public void deleteReview(Long reviewId) {
        reviewRepository.deleteById(reviewId);
    }
}
