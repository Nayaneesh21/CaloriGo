package com.calorigo.dto;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

// Base DTO for common properties
@Getter
@Setter
public abstract class BaseDTO {
    private Long id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}

// Generic CommonDTO for API responses
@Getter
@Setter
public class CommonDTO<T> extends BaseDTO {
    private String message;
    private T data;

    public CommonDTO(String message, T data) {
        this.message = message;
        this.data = data;
    }
}

// Food Item DTO
@Getter
@Setter
public class FoodItemDTO extends BaseDTO {
    private String name;
    private String description;
    private double price;
    private double calories;
    private double protein;
    private double fat;
    private double carbs;
    private Long restaurantId;
}

// Restaurant DTO
@Getter
@Setter
public class RestaurantDTO extends BaseDTO {
    private String name;
    private String address;
    private String phone;
}

// User DTO
@Getter
@Setter
public class UserDTO extends BaseDTO {
    private String username;
    private String email;
}

// Diet Plan DTO
@Getter
@Setter
public class DietPlanDTO extends BaseDTO {
    private String name;
    private String description;
    private double dailyCalories;
    private Long userId;
}

// Review DTO
@Getter
@Setter
public class ReviewDTO extends BaseDTO {
    private int rating;
    private String comment;
    private Long userId;
    private Long foodItemId;
}

// Authentication DTOs
@Getter
@Setter
public class LoginRequestDTO {
    private String email;
    private String password;
}

@Getter
@Setter
public class RegisterRequestDTO {
    private String username;
    private String email;
    private String password;
}

@Getter
@Setter
public class JwtResponseDTO {
    private String token;
    private String username;
}
