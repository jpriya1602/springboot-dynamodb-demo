package com.example.springbootdynamodbdemo;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.auth.InstanceProfileCredentialsProvider;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperConfig;
import com.example.springbootdynamodbdemo.Repository.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DynamoDBConfig {
    @Bean
    public DynamoDBMapper dynamoDBMapper() {
        AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard()
                .withCredentials(new InstanceProfileCredentialsProvider(false))
                .build();

        return new DynamoDBMapper(client, DynamoDBMapperConfig.DEFAULT);
    }
//
//    @Bean
//    public  DynamoDBMapper dynamoDBMapper() {
//        AmazonDynamoDB client = AmazonDynamoDBClientBuilder
//                .standard()
//                .withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration( "http://localhost:8000", "local"))
//                .withCredentials(new AWSStaticCredentialsProvider(new BasicAWSCredentials("local", "local")))
//                .build();
//        return new DynamoDBMapper(client, DynamoDBMapperConfig.DEFAULT);
//    }
}
