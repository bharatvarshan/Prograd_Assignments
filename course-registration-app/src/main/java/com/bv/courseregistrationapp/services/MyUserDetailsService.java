package com.bv.courseregistrationapp.services;


import com.bv.courseregistrationapp.data.UserRepository;
import com.bv.courseregistrationapp.models.Users;
import org.springframework.security.core.userdetails.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Users user = userRepository.findByUsername(username);
        if (user == null) {
            return null;
        }

//        using a repo make connection to the database
                //fetch all the details from the database
        return new User(user.getUsername(), user.getPassword() , new ArrayList<>());
    }
}