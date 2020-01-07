package com.hashan.mapping.web;

import com.hashan.mapping.domain.Review;
import com.hashan.mapping.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/review")
@CrossOrigin
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    @PostMapping("")
    public ResponseEntity<Review> addABook(@RequestBody Review review) {
        return new ResponseEntity<Review>(reviewService.saveOrUpdateABook(review), HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public Iterable<Review> getAllBookings(){
        return reviewService.findAll();
    }

    @GetMapping("/{reviewId}")
    public ResponseEntity<Review> getBookingById(@PathVariable Long reviewId) {
        return new ResponseEntity<Review>(reviewService.findReviewById(reviewId), HttpStatus.OK);
    }
}
