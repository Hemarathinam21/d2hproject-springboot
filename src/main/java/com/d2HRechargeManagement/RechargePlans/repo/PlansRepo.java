package com.d2HRechargeManagement.RechargePlans.repo;

import com.d2HRechargeManagement.RechargePlans.model.RechargeModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public  interface PlansRepo extends JpaRepository<RechargeModel, Integer> {
    Optional<RechargeModel> findRechargeModelByName(String name);
}

