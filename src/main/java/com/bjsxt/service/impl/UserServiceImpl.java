package com.bjsxt.service.impl;

import com.bjsxt.entity.User;
import com.bjsxt.mapper.UserMapper;
import com.bjsxt.service.UserService;
import com.bjsxt.util.DBUtil;

public class UserServiceImpl implements UserService {
    @Override
    public void pay() {

    }

    @Override
    public User login(String name, String pwd) {

        UserMapper mapper = DBUtil.getSqlSession().getMapper(UserMapper.class);
        User user = mapper.selectOne(name, pwd);
        DBUtil.closeAll();
        return user;
    }

    @Override
    public int save(String name, String pwd) {
        UserMapper mapper = DBUtil.getSqlSession().getMapper(UserMapper.class);
        int insert = mapper.insert(name, pwd);
        DBUtil.closeAll();
        return insert;
    }

    @Override
    public int save(User user) {
        UserMapper mapper = DBUtil.getSqlSession().getMapper(UserMapper.class);
        int insert = mapper.insertOne(user);
        DBUtil.closeAll();
        return insert;
    }
}
