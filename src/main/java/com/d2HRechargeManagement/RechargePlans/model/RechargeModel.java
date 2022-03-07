package com.d2HRechargeManagement.RechargePlans.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class RechargeModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    private int rechargeId;
    private String rechargeType;
    private String name;
    private String mobile;
    private String email;
    private int rechargePlan;
    private int rechargePrice;
    public RechargeModel(){}

    public RechargeModel(String rechargeType, String name, String mobile, String email, int rechargePlan, int rechargePrice) {
        this.rechargeType = rechargeType;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.rechargePlan = rechargePlan;
        this.rechargePrice = rechargePrice;
    }

    public int getRechargeId() {
        return rechargeId;
    }

    public void setRechargeId() {
        this.rechargeId = rechargeId;
    }

    public String getRechargeType() {
        return rechargeType;
    }

    public void setRechargeType(String rechargeType) {
        this.rechargeType = rechargeType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRechargePlan() {
        return rechargePlan;
    }

    public void setRechargePlan(int rechargePlan) {
        this.rechargePlan = rechargePlan;
    }

    public int getRechargePrice() {
        return rechargePrice;
    }

    public void setRechargePrice(int rechargePrice) {
        this.rechargePrice = rechargePrice;
    }

    @Override
    public String toString() {
        return "RechargeModel{" +
                "rechargeId=" + rechargeId +
                ", rechargeType='" + rechargeType + '\'' +
                ", name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", rechargePlan=" + rechargePlan +
                ", rechargePrice=" + rechargePrice +
                '}';
    }


}
