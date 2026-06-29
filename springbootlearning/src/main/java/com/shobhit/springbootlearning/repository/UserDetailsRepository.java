package com.shobhit.springbootlearning.repository;

import com.shobhit.springbootlearning.Entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

;

@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails, Long> {
}