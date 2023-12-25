package com.itheima.mapper;

import com.itheima.domain.Animal;
import com.itheima.domain.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface AnimalMapper {
    @Select("select * from t_animal where id=#{id}")
    public Animal findById(int id);
    @Insert("insert into t_animal(id,animalname,zhonglei,pinzhong,age,sex,weight) values  (#{id},#{animalname},#{zhonglei},#{pinzhong},#{age},#{sex},#{weight})")
    public int insert(Animal animal);
    @Update("update t_animal set animalname=#{animalname},zhonglei=#{zhonglei},pinzhong=#{pinzhong},age=#{age},sex=#{sex},weight=#{weignt} where id=#{id}")
    public int update(Animal animal);
    @Delete("delete from t_animal where id=#{id}")
    public int delete(int id);
}
