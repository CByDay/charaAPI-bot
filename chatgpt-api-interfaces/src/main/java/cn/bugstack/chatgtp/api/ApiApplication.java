package cn.bugstack.chatgtp.api;

import cn.bugstack.chatgtp.api.vo.IActorDao;
import cn.bugstack.chatgtp.api.vo.MybatisUtil;
import cn.bugstack.chatgtp.api.vo.Scheduling;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;

/**
 * @description:
 * @author: yanhongwei 
 * @date: 2023/3/20 14:37
 * @param: 
 * @param: null
 * @return: null
 **/
@SpringBootApplication
@EnableScheduling
@EnableAsync
public class ApiApplication {
    public static void main(String[] args) {

        SpringApplication.run(ApiApplication.class,args);

        Scheduling scheduling =new Scheduling();
        scheduling.test01();

    }

//    //  异步多线程，1.开始异步注解 @EnableAsync；2.设置异步执行 @Async
//
//    /**
//     * @description: 顶死任务
//     * @author: zhd
//     * @date: 2023/3/21 22:33
//     * @param:
//     * @return: void
//     **/
//    @Async
//    @Scheduled(fixedRate = 5*60*1000)
//    public void playStr1(){
//        System.out.println("线程"+Thread.currentThread().getName());
//        IActorDao iActorDao = MybatisUtil.getMapper(IActorDao.class);
//        System.out.println(iActorDao.selectById(1));
//        System.out.println("定时任务——多喝热水..."+ DateFormat.getDateTimeInstance().format(new Date()));
//    }
//
//    /**
//     * @description: 在9点到12点这个区间，每个5分钟执行一次
//     *  0   10,44    14    ?     3     WED      * 对应就是 年一般不写，就写6位日期就行了(在soring中，存在报错情况)
//     *  秒， 分钟，   小时， 日期， 月，  星期几     年
//     *  上诉表示的意思是： 在每年的3月的每个星期3 14:10:00 和  14:44:00 触发一个对应的操作
//     * @author: zhd
//     * @date: 2023/3/21 22:34
//     * @param:
//     * @return: void
//     **/
//    @Scheduled(fixedRate = 10*60*1000)
//    @Async
////    @Scheduled(cron = "0 0/5 9,10,11,12 * * ? ")
//    public void playStr2(){
//        System.out.println("线程"+Thread.currentThread().getName());
//        System.out.println("定时任务——该吃药了..."+ DateFormat.getDateTimeInstance().format(new Date()));
//    }
//
    


}
