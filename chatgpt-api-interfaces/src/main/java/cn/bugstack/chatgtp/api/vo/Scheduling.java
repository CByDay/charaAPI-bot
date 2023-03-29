package cn.bugstack.chatgtp.api.vo;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.UUID;

/**
 * @BelongsProject: chatgpt-api
 * @BelongsPackage: cn.bugstack.chatgtp.api.vo
 * @Author: zhd
 * @CreateTime: 2023-03-21  15:39
 * @Description: 定时任务
 * @Version: 1.0
 */
public class Scheduling {

    //直接运行，任务代码cron:定义定时任务的规则 https://www.pppet.net/
    @Scheduled(fixedRate = 5 * 60 * 1000)
    @Async
    public Integer test01() {
        IActorDao iActorDao = MybatisUtil.getMapper(IActorDao.class);
        Actor actor =new Actor();
        actor.setActorId(UUID.randomUUID().toString());
        actor.setFirstName("初始Name"+UUID.randomUUID());
        actor.setLastName("最后的Name"+UUID.randomUUID());
        int i =  iActorDao.insert(actor);
        System.out.println("i= " + i);
        return i;
    }
}
