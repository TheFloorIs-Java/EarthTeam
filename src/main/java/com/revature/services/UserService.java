package com.revature.services;

import com.revature.dtos.UserRequest;
import com.revature.models.User;
import com.revature.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> findByCredentials(String email, String password) {
        return userRepository.findByEmailAndPassword(email, password);
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    /**
     * updateUser(User user)
     * To update information leveraging the Jpa Repository
     */

    public User updateUser(int id, UserRequest userRequest) {
        User user = userRepository.getById(id);
        user.setEmail(userRequest.getEmail());
        user.setFirstName(userRequest.getFirstName());
        return userRepository.save(user);
    }
}
