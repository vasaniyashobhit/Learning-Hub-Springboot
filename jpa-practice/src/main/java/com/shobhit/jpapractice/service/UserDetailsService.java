package com.shobhit.jpapractice.service;

import com.shobhit.jpapractice.exception.UserNotFoundException;
import com.shobhit.jpapractice.entity.UserDetails;
import com.shobhit.jpapractice.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.shobhit.jpapractice.dto.UserResponseDTO;

import java.util.List;
import java.util.stream.Collectors;

@Service

public class UserDetailsService {

    @Autowired
    private UserDetailsRepository userDetailsRepository;

    public UserDetails saveUser(UserDetails user){
        user.setInternalAdminNote("Created via API - flagged for review");
        UserDetails savedUser = userDetailsRepository.save(user);
        return savedUser;
    }

    public List<UserDetails> getAllUsers(){
        return userDetailsRepository.findAll();
    }

    public List<UserDetails> searchByName(String name){
        return userDetailsRepository.findByName(name);
    }

    public List<UserDetails> searchByKeyword(String keyword) {
        return userDetailsRepository.findByNameContaining(keyword);
    }

    public List<UserDetails> searchByDomain(String domain) {
        return userDetailsRepository.findByEmailDomain(domain);
    }

    public String getNameOnly(Long id) {
        return userDetailsRepository.getNameOnlyById(id);
    }

    public UserDetails getUserById(Long id){
        return userDetailsRepository.findById(id).orElseThrow(()->new UserNotFoundException(id));
    }

    public UserResponseDTO getUserDtoById(Long id){
        UserDetails user = userDetailsRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));

        UserResponseDTO dto = new UserResponseDTO(user.getId(), user.getName(), user.getEmail());
        return dto;
    }

    public List<UserResponseDTO> getAllUsersAsDto(){
        List<UserDetails> allUsers = userDetailsRepository.findAll();

        return allUsers.stream()
                .map(user -> new UserResponseDTO(
                    user.getId(),
                    user.getName(),
                    user.getEmail()))
                .collect(Collectors.toList());

    }


}
