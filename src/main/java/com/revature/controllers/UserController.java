package com.revature.controllers;

import com.revature.annotations.Authorized;
import com.revature.models.User;
import com.revature.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/user")
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:3000"}, allowCredentials = "true")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * updateUserById(int id)
     * To complete a PUT request for updating User Information in DB
     *
     * @param id - unique primary key for the User DB
     * @param user - entering every parameter in the User Model (int id, String email, String password, String
     *             firstName, String lastName)
     * @return - Updated User
     */

    @Authorized
    @PutMapping()
    public User updateUser (@RequestBody User user){
        return userService.updateUser(user);
    }
}
