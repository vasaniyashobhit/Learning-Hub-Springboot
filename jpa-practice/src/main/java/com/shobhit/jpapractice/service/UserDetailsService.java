package com.shobhit.jpapractice.service;

import com.shobhit.jpapractice.entity.UserDetails;
import com.shobhit.jpapractice.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UserDetailsService {

    @Autowired
    private UserDetailsRepository userDetailsRepository;

    public UserDetails saveUser(UserDetails user){
        UserDetails savedUser = userDetailsRepository.save(user);
        return savedUser;
    }

    public List<UserDetails> getAllUsers(){
        return userDetailsRepository.findAll();
    }
}
