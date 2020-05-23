package com.muhammedtopgul.springsecurityjpa.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by Muhammed Topgul.
 * Date: 23.05.2020
 * Time: 16:38
 */

@Getter
@Setter
@Entity
@Table(name = "t_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "is_active")
    private Boolean isActive;

    @Column(name = "roles")
    private String roles;
}
