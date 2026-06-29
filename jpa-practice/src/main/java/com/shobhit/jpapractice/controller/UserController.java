package com.shobhit.jpapractice.controller;

import com.shobhit.jpapractice.entity.UserDetails;
import com.shobhit.jpapractice.service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.shobhit.jpapractice.service.EntityManagerDemoService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private EntityManagerDemoService entityManagerDemoService;

    @PostMapping("/manual-user")
    public UserDetails createManualUser(
        @RequestParam String name,
        @RequestParam String email){

        return entityManagerDemoService.createUserManually(name, email);
    }

    @GetMapping("/find-twice/{id}")
    public UserDetails testFindTwice(@PathVariable Long id){
        return entityManagerDemoService.findUserTwice(id);
    }


    @PostMapping("/users")
    public UserDetails createUser(@RequestBody UserDetails user){

        return userDetailsService.saveUser(user);
    }

    @GetMapping("/users")
    public List<UserDetails> getAllUsers(){
        return userDetailsService.getAllUsers();
    }

    @PutMapping("/dirty-check/{id}")
    public String testDirtyChecking(
            @PathVariable Long id,
            @RequestParam String newName
        ) {
        return entityManagerDemoService.updateNameWithoutCallingSave(id,newName);
    }

    @GetMapping("/test-detached/{id}")
    public String testDetachedEntity(@PathVariable Long id) {
        return entityManagerDemoService.demonstrateDetachedEntityProblem(id);
    }

    @PutMapping("/reattach/{id}")
    public UserDetails testReattach(
            @PathVariable Long id,
            @RequestParam String newName) {

        UserDetails detachedUser = new UserDetails();
        detachedUser.setId(id);
        detachedUser.setName(newName);
        detachedUser.setEmail("reattached@gmail.com");

        return entityManagerDemoService.reattachAndSaveDetachedEntity(detachedUser);
    }

}
