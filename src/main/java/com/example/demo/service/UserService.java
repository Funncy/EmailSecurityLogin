package com.example.demo.service;

import com.example.demo.domain.User;

public interface UserService {
    public User findUserByEmail(String email);
    public void saveUser(User user);
    public User findUserByUser_id(int user_id);
    public int updateUser(int active,int user_id);
}