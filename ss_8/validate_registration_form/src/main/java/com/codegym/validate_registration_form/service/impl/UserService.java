package com.codegym.validate_registration_form.service.impl;

import com.codegym.validate_registration_form.model.User;
import com.codegym.validate_registration_form.repository.IUserRepository;
import com.codegym.validate_registration_form.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Autowired
    private IUserRepository iUserRepository;


    @Override
    public User create(User user) {
        return iUserRepository.save(user);
    }
}
