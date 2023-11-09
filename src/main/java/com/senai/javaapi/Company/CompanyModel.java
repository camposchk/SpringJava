package com.senai.javaapi.Company;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.senai.javaapi.User.UserModel;

import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
@Document ("Company")
public class CompanyModel {
    @Id
    private String id; 
    private String nome; 
    @DBRef
    private UserModel idUser;
    @DBRef
    private List<UserModel> listUsers;
}

