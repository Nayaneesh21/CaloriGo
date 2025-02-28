package com.calorigo.service;

import com.calorigo.model.Restaurant;
import java.util.List;
import java.util.Optional;

public interface RestaurantService {
    Restaurant addRestaurant(Restaurant restaurant);
    List<Restaurant> getAllRestaurants();
    Optional<Restaurant> getRestaurantById(Long id);
    Restaurant updateRestaurant(Long id, Restaurant updatedRestaurant);
    void deleteRestaurant(Long id);
}
