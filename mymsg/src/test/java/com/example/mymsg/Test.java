package com.example.mymsg;

import com.example.mymsg.entity.*;
import com.example.mymsg.dao.ClassesMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;

/**
 * Created by David on 2019/8/9.
 */
public class Test {
    private static SqlSessionFactory sqlSessionFactory;
    private static Reader reader;

    static {
        try {
            reader = Resources.getResourceAsReader("mybatis-Config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            ClassesMapper test = session.getMapper(ClassesMapper.class);
           Classes ms=test.selectByPrimaryKey(1);
           System.out.println(ms);
            for (Teacher st:ms.getTeacherSet()) {
                System.out.println(st);
            }

        } finally {
            session.close();
        }
    }
}
