package com.example.demo.repository;

import com.example.demo.domain.EmailToken;
import com.example.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailTokenRepository extends JpaRepository<EmailToken, Long> {
    public EmailToken findByUser(User user);
    public EmailToken findByToken(String Token);
}