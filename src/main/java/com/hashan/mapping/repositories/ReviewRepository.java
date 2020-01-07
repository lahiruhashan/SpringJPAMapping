package com.hashan.mapping.repositories;

import com.hashan.mapping.domain.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends CrudRepository<Review, Long> {
    Review getByReviewId(Long id);
}
