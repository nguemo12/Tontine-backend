package com.springdockerjenhkins.springdevops.users;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String email;
    private int age;
    private String gender;
    private String telephone;

}
