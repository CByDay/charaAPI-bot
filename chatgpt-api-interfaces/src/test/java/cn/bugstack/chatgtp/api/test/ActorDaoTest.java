package cn.bugstack.chatgtp.api.test;

import cn.bugstack.chatgtp.api.vo.Actor;
import cn.bugstack.chatgtp.api.vo.IActorDao;
import cn.bugstack.chatgtp.api.vo.MybatisUtil;
import cn.bugstack.chatgtp.api.vo.Scheduling;
import org.junit.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.List;

/**
 * @BelongsProject: chatgpt-api
 * @BelongsPackage: cn.bugstack.chatgtp.api.test
 * @Author: zhd
 * @CreateTime: 2023-03-21  14:58
 * @Description: TODO
 * @Version: 1.0
 */
@SpringBootApplication
@EnableScheduling
public class ActorDaoTest {

    @Test
    public void a1() {
        IActorDao iActorDao = MybatisUtil.getMapper(IActorDao.class);
        List<Actor> actorList = iActorDao.selectList(null);
        for (Actor actor : actorList) {
            System.out.println(actor);
        }

    }

    @Test
    public void a2() {
        IActorDao iActorDao = MybatisUtil.getMapper(IActorDao.class);
        System.out.println(iActorDao.selectById(1));
    }

    @Test
    public void a3(){
        Scheduling scheduling =new Scheduling();
    }
}
