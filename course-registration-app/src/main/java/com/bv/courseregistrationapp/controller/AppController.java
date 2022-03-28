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

    @RequestMapping(value = "/user-add",method = RequestMethod.POST)
    public ModelAndView addUser(User user,Model model) {
        userRepository.save(user);

        model.addAttribute("user",userRepository.findAll());
        return new ModelAndView("/home");
    }

    @RequestMapping(value = "/user-login",method = RequestMethod.GET)
    public ModelAndView loginUser(User user){
        ModelAndView modelAndView = new ModelAndView();
        if(Objects.equals(user.getEmail(), "admin@bv.com") && Objects.equals(user.getPassword(), "admin")){
            modelAndView.setViewName("redirect:/admin");
        }
            else if(userRepository.findByEmail(user.getEmail()) != null){
                modelAndView.addObject("user",userRepository.findByName(user.getEmail()));
                modelAndView.setViewName("home");

            }
            else{
                modelAndView.setViewName("redirect:/login");
            }

        return modelAndView;
    }


    @RequestMapping(value = "/",method = RequestMethod.GET)
    public ModelAndView index(User user) {
        return new ModelAndView("/landing");
    }

    @GetMapping("/register")
    public String register(){
        return "/Register/register";
    }

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(){
        return "/Login/login";
    }

//    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
//    public ModelAndView user(User user) {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("user",userRepository.findByName(user.getName()));
//        modelAndView.setViewName("/user");
//        return modelAndView;
//    }

    @RequestMapping(value = "/admin",method = RequestMethod.GET)
    public ModelAndView showUser(User user) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("users",userService.findAll());
        modelAndView.setViewName("/Admin/admin");
        return modelAndView;
    }




}