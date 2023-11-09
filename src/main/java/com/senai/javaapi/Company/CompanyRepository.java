package com.senai.javaapi.Company;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.senai.javaapi.User.UserModel;

public interface CompanyRepository extends MongoRepository<CompanyModel, String>{
    
    @Query("{/'name' : ?0}")
    List<CompanyModel> findByName(String name);

    @Query("{/'name' : ?1, 'age' : ?0}")
    List<CompanyModel> findByUsername(UserModel user);
}
