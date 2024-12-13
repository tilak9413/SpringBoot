package com.example.SpringBoot.userRepo;

import com.example.SpringBoot.entity.Firstentity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Firstentity , Integer> {
}
