package com.itheima.mapper;


import com.itheima.domain.Food;
import org.apache.ibatis.annotations.*;

@Mapper
public interface FoodMapper {
    @Select("select * from t_food where id=#{id}")
    public Food findById(int id);
    @Insert("insert IGNORE into t_food(id,water_weight,food_weight,time_m,time_a,time_e,device_id) values  (#{id},#{water_weight},#{food_weight},#{time_m},#{time_a},#{time_e},#{device_id})")
    public int insert(Food food);
    @Update("update t_food set water_weight=#{water_weight},food_weight=#{food_weight},time_m=#{time_m},time_a=#{time_a},time_e=#{time_e} where id=#{id}")
    public int update(Food food);
    @Delete("delete from t_food where id=#{id}")
    public int delete(int id);
}
