package com.muhammedtopgul.springsecurityjpa.repository;

import com.muhammedtopgul.springsecurityjpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by Muhammed Topgul.
 * Date: 23.05.2020
 * Time: 16:46
 */

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByUserName(String userName);
}
