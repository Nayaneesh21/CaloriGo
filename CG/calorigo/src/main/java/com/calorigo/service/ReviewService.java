package com.calorigo.service;

import com.calorigo.model.Review;
import java.util.List;

public interface ReviewService {
    Review addReview(Review review);
    List<Review> getReviewsForFoodItem(Long foodItemId);
    List<Review> getReviewsForRestaurant(Long restaurantId);
    void deleteReview(Long reviewId);
}
