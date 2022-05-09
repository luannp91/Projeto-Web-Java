package com.luannp.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luannp.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
