package com.calorigo.service;

import com.calorigo.model.DietPlan;
import java.util.List;
import java.util.Optional;

public interface DietPlanService {
    DietPlan createDietPlan(DietPlan dietPlan);
    List<DietPlan> getAllDietPlans();
    Optional<DietPlan> getDietPlanById(Long id);
    void deleteDietPlan(Long id);
}
