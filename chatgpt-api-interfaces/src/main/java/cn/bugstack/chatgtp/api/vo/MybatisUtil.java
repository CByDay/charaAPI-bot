package cn.bugstack.chatgtp.api.vo;

import com.baomidou.mybatisplus.core.MybatisSqlSessionFactoryBuilder;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;

import java.io.IOException;
import java.io.InputStream;

/**
 * @BelongsProject: chatgpt-api
 * @BelongsPackage: cn.bugstack.chatgtp.api.vo
 * @Author: zhd
 * @CreateTime: 2023-03-21  14:53
 * @Description: TODO
 * @Version: 1.0
 */
public class MybatisUtil {


    private static SqlSessionFactory factory;
    private static ThreadLocal<SqlSession> local = new ThreadLocal<>();
    private static SqlSession sqlSession;

    static {
        try {
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            MybatisSqlSessionFactoryBuilder builder = new MybatisSqlSessionFactoryBuilder();
            factory = builder.build(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static SqlSession session(boolean b) {
        sqlSession = local.get();
        if (sqlSession == null) {
            sqlSession = factory.openSession(b);
            local.set(sqlSession);
        }
        return sqlSession;
    }

    public static SqlSession getSqlSession() {
        return session(false);
    }

    public static <T> T getMapper(Class<T> c) {
        sqlSession = session(false);
        T t = sqlSession.getMapper(c);
        return t;
    }

}