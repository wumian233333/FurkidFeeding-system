package com.itheima.service.impl;

;
import com.itheima.domain.Food;
import com.itheima.mapper.FoodMapper;
import com.itheima.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.*;
import org.springframework.stereotype.Service;

@Service
public class FoodServiceimpl implements FoodService {
    @Autowired
    private FoodMapper foodMapper;
    @Override
    public Boolean save(Food food) {
        return foodMapper.insert(food) > 0;
    }
    @Override
//    @CacheEvict(value = "foodspace",key = "#id")
    public Boolean delete(Integer id) {
        return foodMapper.delete(id) > 0;
    }
    @Override
//    @CachePut(value = "foodspace",key = "#food.id")
    public Boolean update(Food food) {
        return foodMapper.update(food) > 0;
    }
    @Override
//    @Cacheable(value = "foodspace",key = "#id")
    public Food findById(Integer id) {
        return foodMapper.findById(id);
    }

}
