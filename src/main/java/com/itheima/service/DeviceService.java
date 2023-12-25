package com.itheima.service;

import com.itheima.domain.Device;

public interface DeviceService {
    Boolean save(Device device);
    Boolean delete(Integer id);
    Boolean update(Device device);
    Device findById(Integer id);

}
