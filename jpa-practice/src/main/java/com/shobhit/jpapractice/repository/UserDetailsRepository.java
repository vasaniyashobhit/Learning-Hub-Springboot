package com.shobhit.jpapractice.repository;

import com.shobhit.jpapractice.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDetailsRepository extends JpaRepository <UserDetails, Long>{

    List<UserDetails> findByName(String name);

    List<UserDetails> findByNameAndEmail(String name, String email);

    List<UserDetails> findByNameContaining(String name);

    @Query("SELECT u FROM UserDetails u WHERE u.email LIKE %:domain%")
    List<UserDetails> findByEmailDomain(@Param("domain") String domain);

    @Query("SELECT u.name FROM UserDetails u where u.id = :id")
    String getNameOnlyById(@Param("id") Long id);

}
