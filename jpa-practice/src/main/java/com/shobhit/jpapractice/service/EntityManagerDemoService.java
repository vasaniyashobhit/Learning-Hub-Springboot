package com.shobhit.jpapractice.service;

import com.shobhit.jpapractice.entity.UserDetails;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

@Service
public class EntityManagerDemoService {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public UserDetails createUserManually(String name, String email){
        UserDetails user = new UserDetails();
        user.setName(name);
        user.setEmail(email);

        entityManager.persist(user);

        System.out.println("User added, auto generated id: " + user.getId());

        return user;
    }

    @Transactional
    public UserDetails findUserTwice(Long id){

        System.out.println("---- Calling Find() First Time ----");
        UserDetails firstCall = entityManager.find(UserDetails.class, id);

        System.out.println("---- Calling Find() Second Time ----");
        UserDetails secondCall = entityManager.find(UserDetails.class, id);

        System.out.println("Are both results the same object? " + (firstCall == secondCall));

        return firstCall;
    }

    @Transactional
    public String updateNameWithoutCallingSave(Long id, String newName){
        UserDetails user = entityManager.find(UserDetails.class, id);
        System.out.println("Value in database before update: " + user.getName());

        user.setName(newName);
        System.out.println("Value in java memory (after setter call): "+ user.getName());

        return "Method is ending now. Watch console for the AUTOMATIC update SQL...";
    }

    @Transactional
    public UserDetails fetchUserInsideTransaction(Long id){
        UserDetails user = entityManager.find(UserDetails.class, id);
        System.out.println("Inside Transaction - entity is managed right now");
        return user;
    }

    public String demonstrateDetachedEntityProblem(Long id){

        UserDetails user = fetchUserInsideTransaction(id);

        System.out.println("Outside Transaction - entity is now detached");
        System.out.println("value before setter call: " + user.getName());

        user.setName("Changed while detached - this should not save");
        System.out.println("value after setter call: " + user.getName());

        return "Check the database now — this change will NOT be there!";
    }

    @Transactional
    public UserDetails reattachAndSaveDetachedEntity(UserDetails detachedUser){
        UserDetails managedUser = entityManager.merge(detachedUser);
        System.out.println("Entity successfully reattached and is now Managed");

        return managedUser;
    }
}

