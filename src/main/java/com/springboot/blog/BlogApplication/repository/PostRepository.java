package com.springboot.blog.BlogApplication.repository;

import com.springboot.blog.BlogApplication.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
    
}
