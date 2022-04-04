package com.bv.courseregistrationapp.data;

import org.springframework.data.repository.CrudRepository;

import com.bv.courseregistrationapp.models.Users;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<Users, Integer> {

    public Users findByUsername(String username);


}