package com.example.Student.repository;

import com.example.Student.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<User,Long> {
    User findByUserId(Long userId);
}
