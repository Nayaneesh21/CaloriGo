package com.calorigo.service.impl;

import com.calorigo.model.FoodItem;
import com.calorigo.repository.FoodItemRepository;
import com.calorigo.service.FoodItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class FoodItemServiceImpl implements FoodItemService {

    @Autowired
    private FoodItemRepository foodItemRepository;

    @Override
    public FoodItem addFoodItem(FoodItem foodItem) {
        return foodItemRepository.save(foodItem);
    }

    @Override
    public List<FoodItem> getAllFoodItems() {
        return foodItemRepository.findAll();
    }

    @Override
    public Optional<FoodItem> getFoodItemById(Long id) {
        return foodItemRepository.findById(id);
    }

    @Override
    public List<FoodItem> getFoodItemsByRestaurant(Long restaurantId) {
        return foodItemRepository.findByRestaurantId(restaurantId);
    }

    @Override
    public FoodItem updateFoodItem(Long id, FoodItem updatedFoodItem) {
        return foodItemRepository.findById(id)
                .map(existingFoodItem -> {
                    existingFoodItem.setName(updatedFoodItem.getName());
                    existingFoodItem.setCalories(updatedFoodItem.getCalories());
                    existingFoodItem.setPrice(updatedFoodItem.getPrice());
                    existingFoodItem.setDescription(updatedFoodItem.getDescription());
                    existingFoodItem.setCategory(updatedFoodItem.getCategory());
                    return foodItemRepository.save(existingFoodItem);
                }).orElse(null);
    }

    @Override
    public void deleteFoodItem(Long id) {
        foodItemRepository.deleteById(id);
    }
}
