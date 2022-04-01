package com.bv.courseregistrationapp.controller;


import com.bv.courseregistrationapp.models.User;
import com.bv.courseregistrationapp.data.UserRepository;
import com.bv.courseregistrationapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Objects;

@Controller
public class AppController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/home", method = RequestMethod.POST)
    public ModelAndView addUser(User user, Model model) {
        ModelAndView modelAndView = new ModelAndView();
        if (userRepository.existsByEmail(user.getEmail())) {
            modelAndView.addObject("error","Email Already Exists!");
//            modelAndView.setViewName("redirect:/register");
        } else {
            userRepository.save(user);
//            modelAndView.setViewName("home");
        }
        return modelAndView;
    }

    @RequestMapping(value = "/user-login", method = RequestMethod.GET)
    public ModelAndView loginUser(@RequestParam String email,@RequestParam String password) {
        ModelAndView modelAndView = new ModelAndView();
        if (Objects.equals(email, "admin@bv.com") && Objects.equals(password, "admin")) {
            modelAndView.setViewName("redirect:/admin");
        } else if (userRepository.findByEmail(email) != null) {
            modelAndView.addObject("user", userRepository.findByName(email));
            modelAndView.setViewName("home");


        } else {
            modelAndView.setViewName("redirect:/login");
        }

        return modelAndView;
    }


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index(User user) {
        return new ModelAndView("index");
    }

    @GetMapping("/register")
    public String register() {
        return "/Register/register";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "/Login/login";
    }


    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public ModelAndView showUser(User user) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("users", userService.findAll());
        modelAndView.setViewName("/Admin/admin");
        return modelAndView;
    }


}