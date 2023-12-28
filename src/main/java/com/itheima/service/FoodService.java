package com.itheima.service;


import com.itheima.domain.Food;

public interface FoodService {
    Boolean save(Food food);
    Boolean delete(Integer id);
    Boolean update(Food food);
    Food findById(Integer id);
}
