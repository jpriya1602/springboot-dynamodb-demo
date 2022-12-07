package com.example.springbootdynamodbdemo.Repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.example.springbootdynamodbdemo.Entity.User;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {
    private final DynamoDBMapper dynamoDBMapper;

    public UserRepository(DynamoDBMapper dynamoDBMapper) {
        this.dynamoDBMapper = dynamoDBMapper;
    }

    public User save(User user){
        dynamoDBMapper.save(user);
        return user;
    }



    public User getUserByUserId(String userId){
        User user =  dynamoDBMapper.load(User.class,userId);
        return user;
    }

    public User delete(String userId){
        User user =  dynamoDBMapper.load(User.class,userId);
        dynamoDBMapper.delete(user);
        return user;
    }

}
