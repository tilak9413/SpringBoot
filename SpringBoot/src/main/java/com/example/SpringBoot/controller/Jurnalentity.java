package com.example.SpringBoot.controller;


import com.example.SpringBoot.Model.SingleUserModel;
import com.example.SpringBoot.entity.Firstentity;
import com.example.SpringBoot.userRepo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/First")
public class Jurnalentity {

@Autowired
private UserRepo userRepo ;
    private Map<Integer , Firstentity> firstentityMap = new HashMap<>();


    @GetMapping("/GetUser")
    public List<Firstentity> getAll(){

        List<Firstentity> users = userRepo.findAll();

        return  users ;

    }

    @GetMapping("/GetSingleUser")
    public Optional<Firstentity> getAll(@RequestBody SingleUserModel Id){

        Optional<Firstentity> user = userRepo.findById(Id.getId());

        return  user ;

    }

  @PostMapping("/AddUser")
    public Boolean  createEnrty(@RequestBody Firstentity NewUser  )
    {
        userRepo.save(NewUser);
        return  true;
    }
}
