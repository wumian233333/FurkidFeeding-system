package com.itheima.controller;


import com.alibaba.fastjson.JSON;
import com.itheima.domain.Common;
import com.itheima.domain.Device;
import com.itheima.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/common")
public class CommonController {

    @Autowired
    private CommonService commonService;
    @GetMapping
    public String getUser() {
        return "hello user";
    }

    @PostMapping
    public Boolean save(@RequestBody Common common)
    {
        return commonService.save(common);
    }
    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable Integer id)
    {
        return commonService.delete(id);
    }
    @PutMapping()
    public Boolean update(@RequestBody Common common)
    {
        return commonService.update(common);
    }
    @GetMapping("/{id}")
    public String findById(@PathVariable Integer id)
    {
        Common common = commonService.findById(id);
        if(common != null)
        {
            return JSON.toJSONString( common );
        }
        return null;
    }
}
