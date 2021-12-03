package com.bjsxt.test;

import com.bjsxt.entity.Student;
import com.bjsxt.entity.User;
import com.bjsxt.mapper.UserMapper;
import com.bjsxt.util.DBUtil;


public class TestA {

    public static void main(String[] args) {
        UserMapper mapper = DBUtil.getSqlSession().getMapper(UserMapper.class);
        User user = mapper.selectOne("zhangsan","123");
        System.out.println(user);
        Student s = new Student();
    }
}
