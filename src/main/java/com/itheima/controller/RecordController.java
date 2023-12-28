package com.itheima.controller;

import com.alibaba.fastjson.JSON;
import com.itheima.domain.Record;
import com.itheima.domain.User;
import com.itheima.service.RecordService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/record")
public class RecordController  {
    @Autowired
    private RecordService recordService;
    @GetMapping
    public List<Record> getRecord() {
        return recordService.findAll();
    }

    @PostMapping
    public Boolean save(@RequestBody Record record)
    {


        return recordService.save(record);
    }
    @DeleteMapping("/{id_user}&&{id_device}")
    public Boolean delete(@PathVariable Integer id_user,@PathVariable Integer id_device)
    {
        return recordService.delete(id_user, id_device);
    }
    @PutMapping()
    public Boolean update(@RequestBody Record record)
    {
        return recordService.update(record);
    }
    @GetMapping("/{id_user}&&{id_device}")
    public String findById(@PathVariable Integer id_user,@PathVariable Integer id_device)
    {

        Record record = recordService.findById(id_user,id_device);
        if(record != null)
        {
            return JSON.toJSONString(record);
        }
        return null;
    }

}
