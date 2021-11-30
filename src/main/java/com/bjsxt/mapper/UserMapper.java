package com.bjsxt.mapper;

import com.bjsxt.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    public User selectOne(String name, String pwd);

    public List<User> selectAll();

    @Insert("insert into user (uname,pwd) values ('#{param1}','#{param2}')")
    public int insert(String uname, String pwd);

    public int insertOne(User user);

}
