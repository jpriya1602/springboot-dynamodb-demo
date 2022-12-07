package com.example.springbootdynamodbdemo.Controller;

import com.example.springbootdynamodbdemo.Dto.UserDto;
import com.example.springbootdynamodbdemo.Entity.User;
import com.example.springbootdynamodbdemo.Service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
@Slf4j
public class UserController {

    final
    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users/{userId}")
    public User getUserByUserId(@PathVariable String userId ) {
        log.info("Get users by userName");
        return userService.getUserByUserId(userId);
    }

    @PostMapping("/users")
    public User createUser(@RequestBody UserDto userDto){
        return userService.createUser(userDto);
    }

}
