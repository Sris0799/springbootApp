package com.nagarro.user.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table( name = "users")
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long userId;

    private String username;
    private String role;
    private String email;

}
