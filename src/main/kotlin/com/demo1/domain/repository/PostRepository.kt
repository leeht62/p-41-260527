package com.demo1.domain.repository

import com.demo1.domain.entity.Post
import org.springframework.data.jpa.repository.JpaRepository

interface PostRepository : JpaRepository<Post, Long>