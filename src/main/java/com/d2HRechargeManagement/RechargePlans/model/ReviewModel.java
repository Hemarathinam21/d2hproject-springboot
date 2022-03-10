package com.d2HRechargeManagement.RechargePlans.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="review")
public class ReviewModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    private int review_id;
    private String name;
    private String feedback;
    private int rating;
    public ReviewModel(){}

    public ReviewModel(String name, String feedback, int rating) {
        this.name = name;
        this.feedback = feedback;
        this.rating = rating;
    }

    public int getReviewId() {
        return review_id;
    }

    public void setReviewId(int reviewId) {
        this.review_id = reviewId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "ReviewModel{" +
                "reviewId=" + review_id +
                ", name='" + name + '\'' +
                ", feedback='" + feedback + '\'' +
                ", rating=" + rating +
                '}';
    }
}
