package com.calorigo.controller;

import com.calorigo.model.DietPlan;
import com.calorigo.service.DietPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/dietplans")
public class DietPlanController {

    @Autowired
    private DietPlanService dietPlanService;

    @PostMapping
    public ResponseEntity<DietPlan> createDietPlan(@RequestBody DietPlan dietPlan) {
        return ResponseEntity.ok(dietPlanService.createDietPlan(dietPlan));
    }

    @GetMapping
    public ResponseEntity<List<DietPlan>> getAllDietPlans() {
        return ResponseEntity.ok(dietPlanService.getAllDietPlans());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<DietPlan>> getDietPlanById(@PathVariable Long id) {
        return ResponseEntity.ok(dietPlanService.getDietPlanById(id));
    }
}
