package com.itheima.domain;

import java.io.Serializable;
import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
@Data
@Entity(name = "t_record")
public class Record implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_user,id_device;

    private int water;
    private int food;
    private Date time_m;
    private Date time_a;
    private Date time_e;
    private Date date;

}
