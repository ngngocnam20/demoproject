package com.example.demo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository <User, Integer>
{
    @Query("SELECT u FROM User u WHERE u.email = ?1")
    User find(String email);

}
