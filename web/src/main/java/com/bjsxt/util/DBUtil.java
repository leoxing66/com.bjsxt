package com.bjsxt.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class DBUtil {

    private static SqlSessionFactory factory;
    private static ThreadLocal<SqlSession> t1 = new ThreadLocal<>();

        static {
            InputStream inputStream = null;
            try {
                //解析mybatis
                inputStream = Resources.getResourceAsStream("mybatis.xml");
                //获得工厂
                factory = new SqlSessionFactoryBuilder().build(inputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //获得Session对象
    public static SqlSession getSqlSession(){
        SqlSession sqlSession = t1.get();
        if(sqlSession == null){
            sqlSession = factory.openSession(true);
            t1.set(sqlSession);
        }
        return t1.get();
    }

    public static void closeAll(){
            SqlSession sqlSession = t1.get();
            if(sqlSession != null){
                sqlSession.close();
            }
            t1.set(null);
    }

}
