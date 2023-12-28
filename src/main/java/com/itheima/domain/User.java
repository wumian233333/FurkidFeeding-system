package com.itheima.domain;



import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity(name = "t_user")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
}
