package com.itheima.controller;


import com.itheima.domain.Common;
import com.itheima.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
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
    public Common findById(@PathVariable Integer id)
    {
        return commonService.findById(id);
    }
}
