package com.itheima.service.impl;


import com.itheima.domain.Animal;
import com.itheima.mapper.AnimalMapper;
import com.itheima.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class AnimalServiceimpl implements AnimalService {
    @Autowired
    private AnimalMapper animalMapper;
    @Override
    public Boolean save(Animal animal) {
        return animalMapper.insert(animal) > 0;
    }
    @Override
//    @CacheEvict(value = "animalspace",key = "#id")
    public Boolean delete(Integer id) {
        return animalMapper.delete(id) > 0;
    }
    @Override
//    @CachePut(value = "animalspace",key = "#animal.id")
    public Boolean update(Animal animal) {
        return animalMapper.update(animal) > 0;
    }
    @Override
//    @Cacheable(value = "animalspace",key = "#id")
    public Animal findById(Integer id) {
        return animalMapper.findById(id);
    }
}
