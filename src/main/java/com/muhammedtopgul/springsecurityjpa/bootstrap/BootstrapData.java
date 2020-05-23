package com.muhammedtopgul.springsecurityjpa.bootstrap;

import com.muhammedtopgul.springsecurityjpa.model.User;
import com.muhammedtopgul.springsecurityjpa.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Muhammed Topgul.
 * Date: 23.05.2020
 * Time: 17:07
 */

@Component
public class BootstrapData implements ApplicationListener<ContextRefreshedEvent> {

   private final UserRepository userRepository;

   @Autowired
    public BootstrapData(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
       // userRepository.saveAll( getUsers() );
    }

    private List<User> getUsers() {
        List<User> users = new ArrayList<>();

        User user1 = new User();
        user1.setUserName( "mtopgul" );
        user1.setPassword( "5806" );
        user1.setIsActive( true );
        user1.setRoles( "ROLE_ADMIN" );
        users.add( user1 );

        User user2 = new User();
        user2.setUserName( "john-doe" );
        user2.setPassword( "0000" );
        user2.setIsActive( true );
        user2.setRoles( "ROLE_USER" );
        users.add( user2 );

        User user3 = new User();
        user3.setUserName( "jack-pi" );
        user3.setPassword( "1111" );
        user3.setIsActive( true );
        users.add( user3 );

       return users;
    }

}