package com.shobhit.springbootlearning.service;

import com.shobhit.springbootlearning.Entity.UserDetails;
import com.shobhit.springbootlearning.repository.UserDetailsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDetailService {

    private final UserDetailsRepository userDetailsRepository;

    public UserDetailService(UserDetailsRepository userDetailsRepository) {
        this.userDetailsRepository = userDetailsRepository;
    }

    public UserDetails saveUser(UserDetails userDetails) {
        return userDetailsRepository.save(userDetails);
    }

    public List<UserDetails> getAllUsers() {
        return userDetailsRepository.findAll();
    }
}