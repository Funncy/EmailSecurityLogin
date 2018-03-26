package com.example.demo.service;

import com.example.demo.domain.EmailToken;
import com.example.demo.repository.EmailTokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailTokenServiceImpl implements EmailTokenService {

    @Autowired
    EmailTokenRepository emailTokenRepository;

    @Override
    public EmailToken findByEmail_Token(String token) {
        return emailTokenRepository.findByToken(token);
    }
}
