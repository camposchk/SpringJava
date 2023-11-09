package com.senai.javaapi.Company;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.javaapi.User.UserModel;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanyService CompanyService;

    @GetMapping("")
    public List<CompanyModel> getAllCompany() {
        List<CompanyModel> listRes = CompanyService.findAll();
        return listRes;
    }

    @GetMapping("/{name}")
    public List<CompanyModel> getCompanyByName(@PathVariable String name) {
        List<CompanyModel> listRes = CompanyService.findByName(name);
        return listRes;
    }

    @GetMapping("/{username}")
    public List<CompanyModel> getCompanyByUsername(@PathVariable UserModel user, @PathVariable String name) {
        List<CompanyModel> listRes = CompanyService.findByUsername(user);
        return listRes;
    }

    @PostMapping("")
    public void newCompany(@RequestBody CompanyModel newCompany) {
        CompanyService.save(newCompany);
    }

    @PutMapping("/{id}")
    public void putCompany(@RequestBody CompanyModel newCompany, @PathVariable String id) {
        this.CompanyService.save((String) id, (String) newCompany.getNome(), null);
    }

    @DeleteMapping("/delete{id}")
    public void deleteCompany(@PathVariable String id) {
        CompanyService.delete(id);
    }
}
