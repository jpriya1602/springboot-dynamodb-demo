package com.example.springbootdynamodbdemo.Service;

import com.example.springbootdynamodbdemo.Dto.UserDto;
import com.example.springbootdynamodbdemo.Entity.User;
import com.example.springbootdynamodbdemo.Repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserByUserId(String userId) {
        return userRepository.getUserByUserId(userId);
    }

    public User createUser(UserDto userDto) {
        User newUser =  new User(userDto.getUserName(),userDto.getEmail(), userDto.getPhoneNumber());
        return userRepository.save(newUser);
    }
}
