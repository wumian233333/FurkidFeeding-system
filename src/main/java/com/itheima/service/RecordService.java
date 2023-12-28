package com.itheima.service;


import com.itheima.domain.Record;

import java.util.List;

public interface RecordService {
    Boolean save(Record record);
    Boolean delete(Integer id_user , Integer id_device);
    Boolean update(Record record);
    Record findById(Integer id_user , Integer id_device);

    List<Record> findAll();
}
