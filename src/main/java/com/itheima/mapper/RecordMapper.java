package com.itheima.mapper;


import com.itheima.domain.Record;
import org.apache.ibatis.annotations.*;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface RecordMapper {
    @Select("select * from t_record where id_user=#{id_user} and id_device=#{id_device}")
    public Record findById(int id_user,int id_device);
    @Insert("insert IGNORE into t_record(id_user,id_device,water,food,time_m,time_a,time_e,data) values  (#{id_user},#{id_device},#{water},#{food},#{time_m},#{time_a},#{time_e},#{data})")
    public int insert(Record record);
    @Update("update t_record set water=#{weight},food=#{food},time_m=#{time_m},time_a=#{time_a},time_e=#{time_e} where id_user=#{id_user} and id_device=#{id_device}")
    public int update(Record record);
    @Delete("delete from t_record where id_user=#{id_user} and id_device=#{id_device}")
    public int delete(int id_user,int id_device);

    @Select("select * from t_record ")
    public List<Record> findAll();
}
