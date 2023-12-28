package com.itheima.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@Entity(name = "t_food")
public class Food implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int water_weight;
    int food_weight;
    Date time_m;
    Date time_a;
    Date time_e;
    int device_id;

}
