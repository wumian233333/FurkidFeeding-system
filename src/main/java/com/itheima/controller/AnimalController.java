package com.itheima.controller;

import com.itheima.domain.Animal;
import com.itheima.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class AnimalController {
    @Autowired
    private AnimalService animalService;
    @GetMapping
    public String getUser() {
        return "hello animal";
    }

    @PostMapping
    public Boolean save(@RequestBody Animal animal)
    {
        return animalService.save(animal);
    }
    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable Integer id)
    {
        return animalService.delete(id);
    }
    @PutMapping()
    public Boolean update(@RequestBody Animal anima)
    {
        return animalService.update(anima);
    }
    @GetMapping("/{id}")
    public Animal  findById(@PathVariable Integer id)
    {
        return animalService.findById(id);
    }
}
