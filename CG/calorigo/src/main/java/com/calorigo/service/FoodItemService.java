package com.calorigo.service;

import com.calorigo.model.FoodItem;
import java.util.List;
import java.util.Optional;

public interface FoodItemService {
    FoodItem addFoodItem(FoodItem foodItem);
    List<FoodItem> getAllFoodItems();
    Optional<FoodItem> getFoodItemById(Long id);
    List<FoodItem> getFoodItemsByRestaurant(Long restaurantId);
    FoodItem updateFoodItem(Long id, FoodItem updatedFoodItem);
    void deleteFoodItem(Long id);
}
