package com.revature.services;

import com.revature.models.User;
import com.revature.repositories.OrderRepository;
import com.revature.repositories.UserRepository;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@ExtendWith(MockitoExtension.class)
@RunWith(MockitoJUnitRunner.class)
public class OrderServiceTest {

    @InjectMocks
    OrderService orderServiceMock;

    @Mock
    OrderRepository orderRepositoryMock;


    @Test
    public void findAllTest() {
        assertNotNull(orderServiceMock.findAll());
    }

    @Test
    public void findByIdTest(){
        assertNotNull(orderServiceMock.findByUserId(1));
    }
}