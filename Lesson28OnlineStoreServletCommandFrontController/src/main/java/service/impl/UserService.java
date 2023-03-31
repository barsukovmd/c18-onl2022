package service.impl;

import jakarta.inject.Inject;
import models.User;
import repository.UserRepository;

public class UserService {
    @Inject
    private UserRepository userRepository;
}
