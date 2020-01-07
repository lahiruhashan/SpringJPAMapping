package com.hashan.mapping.service;

import com.hashan.mapping.domain.Review;
import com.hashan.mapping.repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;

    public Review saveOrUpdateABook(Review review) {
        return reviewRepository.save(review);
    }

    public Review findReviewById(Long bookId) {
        return reviewRepository.getByReviewId(bookId);
    }

    public Iterable<Review> findAll() {
        return reviewRepository.findAll();
    }
}
