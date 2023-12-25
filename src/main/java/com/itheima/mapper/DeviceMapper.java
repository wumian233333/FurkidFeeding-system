package com.itheima.mapper;

import com.itheima.domain.Device;
import com.itheima.domain.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface DeviceMapper {
    @Select("select * from t_device where id=#{id}")
    public Device findById(int id);
    @Insert("insert into t_device(id,shebeihao,xinghao,status) values  (#{id},#{shebeihao},#{xinghao},#{status})")
    public int insert(Device device);
    @Update("update t_device set shebeihao=#{shebeihao},xinghao=#{xinghao},status=#{status} where id=#{id}")
    public int update(Device device);
    @Delete("delete from t_device where id=#{id}")
    public int delete(int id);
}
