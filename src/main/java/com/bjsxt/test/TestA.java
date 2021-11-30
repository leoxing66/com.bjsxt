package com.bjsxt.test;

import com.bjsxt.entity.User;
import com.bjsxt.mapper.UserMapper;
import com.bjsxt.util.DBUtil;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class TestA {

    public static void main(String[] args) {
        UserMapper mapper = DBUtil.getSqlSession().getMapper(UserMapper.class);
        User user = mapper.selectOne("zhangsan","123");
        System.out.println(user);
    }
}
