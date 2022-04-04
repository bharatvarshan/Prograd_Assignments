package com.bv.courseregistrationapp.controller;


import com.bv.courseregistrationapp.data.UserRepository;
import com.bv.courseregistrationapp.models.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordencoder;

    @RequestMapping("/")
    public String home(){
        return "home.jsp";
    }

    @GetMapping("/register")
    public String addNewUser () {
        return "register.jsp";
    }

    @GetMapping("/login")
    public String login() {
        return "login.jsp";
    }

    @GetMapping("/registersuccess")
    public String login(Users user) {
        user.setPassword(passwordencoder.encode(user.getPassword()));
        userRepository.save(user);
        return "registersucess.jsp";
    }

    @PostMapping("/loginsuccess")
    public String loginSuccess(@RequestParam String username, @RequestParam String password) {
        Users uname = userRepository.findByUsername(username);
        if (userRepository.findByUsername(username) != null) {
            if (uname.getPassword().equals(password)) {
                return "loginsuccess.jsp";
            }
        }
        return "loginfailure.jsp";
    }


}