package com.muhammedtopgul.springsecurityjpa.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Set;

/**
 * Created by Muhammed Topgul.
 * Date: 23.05.2020
 * Time: 15:18
 */

@RestController
public class HomeResource {

//    @GetMapping("/")
//    public String home() {
//        return ("<h1>Welcome</h1>");
//    }
//
//    @GetMapping("/user")
//    public String user() {
//        return ("<h1>Welcome User</h1>");
//    }
//
//    @GetMapping("/admin")
//    public String admin() {
//        return ("<h1>Welcome Admin</h1>");
//    }
//
//    @GetMapping("/logout")
//    public String logout(HttpServletRequest request, HttpServletResponse response) {
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        if (authentication != null) {
//            new SecurityContextLogoutHandler().logout( request, response, authentication );
//        }
//        return "redirect:/login-form";
//    }
//
//    @GetMapping("/login-form")
//    public String loginForm() {
//        return "<h1>Login Form</h1>";
//    }
//
//    @GetMapping("/login?error")
//    public String loginError() {
//        return "<h1>Login Error</h1>";
//    }
}
