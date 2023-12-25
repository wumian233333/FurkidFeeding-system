package com.itheima.controller;


import com.itheima.domain.Device;
import com.itheima.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/1")
public class DeviceController {
    @Autowired
    private DeviceService deviceService;
    @GetMapping
    public String getUser() {
        return "hello user";
    }

    @PostMapping
    public Boolean save(@RequestBody Device device)
    {
        return deviceService.save(device);
    }
    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable Integer id)
    {
        return deviceService.delete(id);
    }
    @PutMapping()
    public Boolean update(@RequestBody Device device)
    {
        return deviceService.update(device);
    }
    @GetMapping("/{id}")
    public Device findById(@PathVariable Integer id)
    {
        return deviceService.findById(id);
    }
}
