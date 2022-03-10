package com.d2HRechargeManagement.RechargePlans.controller;

import com.d2HRechargeManagement.RechargePlans.model.ReviewModel;
import com.d2HRechargeManagement.RechargePlans.service.ReviewService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*",maxAge = 3600)
@RestController
@RequestMapping("/user")
public class ReviewController {
    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @PostMapping("/addReview")
    public ResponseEntity<ReviewModel> addReview(@RequestBody ReviewModel data){
        ReviewModel newReviewModel=reviewService.addReview(data);
        return new ResponseEntity(newReviewModel, HttpStatus.CREATED);
    }
    @GetMapping("/getReview")
    public ResponseEntity<List<ReviewModel>> getReview(){
        List<ReviewModel> reviewModels= ReviewService.findAllReviewModel();
        return new ResponseEntity<>(reviewModels, HttpStatus.OK);
    }

    @PutMapping("/updateReview")
    public ReviewModel updateReview(@RequestBody ReviewModel add)
    {

        return reviewService.updateReview(add);
    }

    @DeleteMapping("/deleteReview/{review_id}")
    public void deleteReview(@PathVariable("review_id") int review_id)
    {
        reviewService.deleteReview(review_id);
    }
}
