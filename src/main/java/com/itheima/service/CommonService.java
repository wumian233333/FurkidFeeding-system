package com.itheima.service;


import com.itheima.domain.Common;

public interface CommonService {
    Boolean save(Common common);
    Boolean delete(Integer id);
    Boolean update(Common common);
    Common findById(Integer id);

}
