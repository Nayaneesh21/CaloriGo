package com.calorigo.service.impl;

import com.calorigo.model.DietPlan;
import com.calorigo.repository.DietPlanRepository;
import com.calorigo.service.DietPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class DietPlanServiceImpl implements DietPlanService {

    @Autowired
    private DietPlanRepository dietPlanRepository;

    @Override
    public DietPlan createDietPlan(DietPlan dietPlan) {
        return dietPlanRepository.save(dietPlan);
    }

    @Override
    public List<DietPlan> getAllDietPlans() {
        return dietPlanRepository.findAll();
    }

    @Override
    public Optional<DietPlan> getDietPlanById(Long id) {
        return dietPlanRepository.findById(id);
    }

    @Override
    public void deleteDietPlan(Long id) {
        dietPlanRepository.deleteById(id);
    }
}
