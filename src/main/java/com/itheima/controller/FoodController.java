package com.itheima.controller;


import com.alibaba.fastjson.JSON;
import com.itheima.domain.Food;
import com.itheima.domain.User;
import com.itheima.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/food")
public class FoodController {
    @Autowired
    private FoodService foodService;
    @GetMapping
    public String getFood() {
        return "hello food";
    }

    @PostMapping
    public Boolean save(@RequestBody Food food)
    {
        return foodService.save(food);
    }
    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable Integer id)
    {
        return foodService.delete(id);
    }
    @PutMapping()
    public Boolean update(@RequestBody Food food)
    {
        return foodService.update(food);
    }
    @GetMapping("/{id}")
    public String findById(@PathVariable Integer id)
    {

        Food food =  foodService.findById(id);
        if(food != null)
        {
            return JSON.toJSONString(food);
        }
        return null;
    }

}
