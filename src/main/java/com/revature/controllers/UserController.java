package com.revature.controllers;

import com.revature.annotations.Authorized;
import com.revature.dtos.UserRequest;
import com.revature.models.User;
import com.revature.services.UserService;
import org.springframework.web.bind.annotation.*;

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
     * Utilizing a DTO to hold our data to be passed into our Request Body, this allows for us to have more control
     * in what the user is allowed to update
     *
     * @param id   - unique primary key for the User DB
     * @param userRequest - entering the parameters we have set in the UserRequest (String email, String firstName)
     * @return - Updated User
     */

    @Authorized
    @PutMapping("/{id}")
    public User updateUser(@PathVariable int id, @RequestBody UserRequest userRequest) {
        return userService.updateUser(id, userRequest);
    }
}
