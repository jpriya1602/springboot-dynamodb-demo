package com.example.springbootdynamodbdemo.Dto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
    private String userName;
    private String email;
    private String phoneNumber;
}
