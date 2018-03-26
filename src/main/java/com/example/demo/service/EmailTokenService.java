package com.example.demo.service;

import com.example.demo.domain.EmailToken;

public interface EmailTokenService {
    public EmailToken findByEmail_Token(String token);
}
