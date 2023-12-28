package com.itheima.service.impl;


import com.itheima.mapper.RecordMapper;
import com.itheima.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.*;
import org.springframework.stereotype.Service;
import com.itheima.domain.Record;

import java.util.List;

@Service
public class RecordServiceimpl implements RecordService {
    @Autowired
    private RecordMapper recordMapper;
    @Override
    public Boolean save(Record record) {
        return recordMapper.insert(record) > 0;
    }
    @Override
//    @CacheEvict(value = "recordspace",key = "#id")
    public Boolean delete(Integer id_user,Integer id_device) {
        return recordMapper.delete(id_user, id_device) > 0;
    }
    @Override
//    @CachePut(value = "recordspace",key = "#user.id")
    public Boolean update(Record record) {
        return recordMapper.update(record) > 0;
    }
    @Override
//    @Cacheable(value = "recordspace",key = "#id")
    public Record findById(Integer id_user,Integer id_device) {
        return recordMapper.findById(id_user, id_device);
    }

    @Override
    public List<Record> findAll(){
        return recordMapper.findAll();
    }
}
