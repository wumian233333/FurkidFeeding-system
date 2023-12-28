package com.itheima.service.impl;

import com.itheima.domain.Device;
import com.itheima.mapper.DeviceMapper;
import com.itheima.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class DeviceServiceimpl implements DeviceService {
    @Autowired
    private DeviceMapper deviceMapper;
    @Override
    public Boolean save(Device device) {
        return deviceMapper.insert(device) > 0;
    }
    @Override
//    @CacheEvict(value = "devicespace",key = "#id")
    public Boolean delete(Integer id) {
        return deviceMapper.delete(id) > 0;
    }
    @Override
//    @CachePut(value = "devicespace",key = "#device.id")
    public Boolean update(Device device) {
        return deviceMapper.update(device) > 0;
    }
    @Override
//    @Cacheable(value = "devicespace",key = "#id")
    public Device findById(Integer id) {
        return deviceMapper.findById(id);
    }
}
