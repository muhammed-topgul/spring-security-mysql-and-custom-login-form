package com.muhammedtopgul.springsecurityjpa.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Created by Muhammed Topgul.
 * Date: 23.05.2020
 * Time: 15:22
 */

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Qualifier("myUserDetailsService")
    @Autowired
    UserDetailsService userDetailsService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService( userDetailsService );
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers( "/admin" ).hasRole( "ADMIN" )
                .antMatchers( "/user" ).hasAnyRole( "ADMIN", "USER" )
                .antMatchers( "/" ).permitAll()
                .and().formLogin().loginPage( "/login-form" )
                .loginProcessingUrl( "/authenticateTheUser" )
                .permitAll()
                .and().logout().permitAll()
                .and()
                .exceptionHandling().accessDeniedPage( "/access-denied" );
    }

    @Bean
    public PasswordEncoder getPasswordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
}
