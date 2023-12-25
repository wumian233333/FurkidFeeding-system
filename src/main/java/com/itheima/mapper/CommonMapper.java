package com.itheima.mapper;

import com.itheima.domain.Common;
import com.itheima.domain.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface CommonMapper {
    @Select("select * from t_common where id=#{id}")
    public Common findById(int id);
    @Insert("insert into t_common(id,text,tiaokuan,yinsi,lianxi) values  (#{id},#{text},#{tiaokuan},#{yinsi},#{lianxi})")
    public int insert(Common common);
    @Update("update t_common set text=#{text},tiaokuan=#{tiaokuan},yinsi=#{yinsi},lianxi=#{lianxi} where id=#{id}")
    public int update(Common common);
    @Delete("delete from t_common where id=#{id}")
    public int delete(int id);
}
