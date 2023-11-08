package com.senai.javaapi;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Document ("user")
@AllArgsConstructor
@Data
public class UserModel {
    @Id
    private String id; 
    private String nome; 
    private short age;
}
