package com.revature.services;

import com.revature.models.User;
import com.revature.repositories.UserRepository;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {

    @InjectMocks
    UserService userServiceMock;

    @Mock
    UserRepository userRepositoryMock;

    @Test
    public void updateUserTest() {
        User userMock = new User();
        userRepositoryMock.save(userMock);
        Mockito.verify(userRepositoryMock).save(userMock);
    }
}