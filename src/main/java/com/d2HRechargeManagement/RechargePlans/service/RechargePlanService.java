package com.d2HRechargeManagement.RechargePlans.service;

import com.d2HRechargeManagement.RechargePlans.exception.UserNotFoundException;
import com.d2HRechargeManagement.RechargePlans.model.RechargeModel;
import com.d2HRechargeManagement.RechargePlans.repo.PlansRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RechargePlanService {
    private static  PlansRepo plansRepo=null;
    @Autowired
    public RechargePlanService(PlansRepo plansRepo) {
        this.plansRepo = plansRepo;
    }

    public static RechargeModel addRecharge(RechargeModel data){
        return plansRepo.save(data);

    }
    public static List<RechargeModel> findAllRechargeModel(){
        return plansRepo.findAll();
    }

    public static RechargeModel findRechargeModelByName(String name){
        return plansRepo.findRechargeModelByName(name).
                orElseThrow(()-> new UserNotFoundException("user not found"));
    }
    public RechargeModel updatePlan(RechargeModel m)
    {
        int rechargeId=m.getRechargeId();
        RechargeModel add=plansRepo.findById(rechargeId).get();
        add.setRechargePlan(m.getRechargePlan());
        add.setRechargeType(m.getRechargeType());
        add.setRechargePrice(m.getRechargePrice());
        return plansRepo.save(add);
    }

    public void delete(int rechargeId)
    {
        plansRepo.deleteById(rechargeId);
    }
}
