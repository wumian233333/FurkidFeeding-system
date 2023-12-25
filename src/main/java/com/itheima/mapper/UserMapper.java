package com.itheima.mapper;


import org.apache.ibatis.annotations.*;
import com.itheima.domain.User;
@Mapper
public interface UserMapper  {
    @Select("select * from t_user where id=#{id}")
    public User findById(int id);
    @Insert("insert into t_user(id,username) values  (#{id},#{username})")
    public int insert(User user);
    @Update("update t_user set username=#{username} where id=#{id}")
    public int update(User user);
    @Delete("delete u , a , d ,ua , ud  from t_user  u , t_animal a,t_device d,t_user_animal ua,t_user_device ud " +
            "where u.id=#{id} and u.id=ua.user_id and ua.animal_id=a.id and u.id = ud.user_id and ud.device=d.id")
    public int delete(int id);

}
