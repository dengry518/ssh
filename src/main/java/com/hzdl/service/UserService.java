package com.hzdl.service;


import com.hzdl.entity.User;
import com.hzdl.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getUserList() {
        return userRepository.findAll();
    }

    public User getUserById(int id) {
        return userRepository.getOne(id);
    }


}
