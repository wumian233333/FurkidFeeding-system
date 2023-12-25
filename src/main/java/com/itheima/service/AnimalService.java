package com.itheima.service;


import com.itheima.domain.Animal;

public interface AnimalService {
    Boolean save(Animal animal);
    Boolean delete(Integer id);
    Boolean update(Animal animal);
    Animal findById(Integer id);
}
