package com.muhammedtopgul.springsecurityjpa.service;

import com.muhammedtopgul.springsecurityjpa.model.MyUserDetails;
import com.muhammedtopgul.springsecurityjpa.model.User;
import com.muhammedtopgul.springsecurityjpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by Muhammed Topgul.
 * Date: 23.05.2020
 * Time: 15:35
 */

@Service
public class MyUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Autowired
    public MyUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByUserName( userName );
        user.orElseThrow( ()-> new UsernameNotFoundException( "Not Found : " + userName ) );
        return user.map( MyUserDetails::new ).get();
    }
}
