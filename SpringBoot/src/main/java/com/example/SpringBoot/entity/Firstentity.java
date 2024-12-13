package com.example.SpringBoot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Firstentity {

    @Id
    private  Integer id ;
    private  String title ;
    private String content;


}
