package com.epam.training.imagine.service;

import com.epam.training.imagine.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService extends AbstractGenericBusinessEntityServiceImpl<User, Long> {
    protected UserService(JpaRepository<User, Long> userRepository) {
        super(userRepository);
    }
}
