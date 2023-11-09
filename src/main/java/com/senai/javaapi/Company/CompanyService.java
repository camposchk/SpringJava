package com.senai.javaapi.Company;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.javaapi.User.UserModel;

@Service
public class CompanyService {
    
    @Autowired
    private CompanyRepository CompanyRepository;

    public CompanyModel save(CompanyModel CompanyModel) {
        return this.CompanyRepository.save(CompanyModel);
    }

    public void save(String id, String name, UserModel user) {
        this.CompanyRepository.save(new CompanyModel(id, name, user, null));
    }

    public List<CompanyModel> findAll() {
        return (List<CompanyModel>) this.CompanyRepository.findAll();
    }

    public List<CompanyModel> findByName(String name) {
        return (List<CompanyModel>) this.CompanyRepository.findByName(name);
    }

    public List<CompanyModel> findByUsername(UserModel user) {
        return (List<CompanyModel>) this.CompanyRepository.findByUsername(user);
    }

    public void delete(String id) {
        this.CompanyRepository.deleteById(id);
    }

}
