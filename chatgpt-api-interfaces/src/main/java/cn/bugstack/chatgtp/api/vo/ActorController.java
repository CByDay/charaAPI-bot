package cn.bugstack.chatgtp.api.vo;

import org.checkerframework.checker.units.qual.A;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @BelongsProject: chatgpt-api
 * @BelongsPackage: cn.bugstack.chatgtp.api.vo
 * @Author: zhd
 * @CreateTime: 2023-03-22  20:23
 * @Description: TODO
 * @Version: 1.0
 */
@CrossOrigin
@RestController
@RequestMapping("/actor")
public class ActorController {

    @ResponseBody
    @RequestMapping(value = {"/selectById"}, method = {RequestMethod.GET})
    public Actor a2(@RequestParam(required = false) String actorId) {
        IActorDao iActorDao = MybatisUtil.getMapper(IActorDao.class);
        System.out.println("actorIdGet：    "+actorId);
        Actor actor= iActorDao.selectById(actorId);
        return actor;
    }

    @ResponseBody
    @RequestMapping(value = {"/selectByIdPost"}, method = {RequestMethod.POST})
    public Actor a3(@RequestParam(required = false) String actorId) {
        IActorDao iActorDao = MybatisUtil.getMapper(IActorDao.class);
        System.out.println("actorIdPost：    "+actorId);
        Actor actor= iActorDao.selectById(actorId);
        return actor;
    }

    /**
     * @description: 小程序post请求后端的参数接收方法
     * @author: zhd
     * @date: 2023/3/29 11:11
     * @param:
     * @param: actorId
     * @return: Actor
     **/
    @ResponseBody
    @RequestMapping(value = {"/selectByIdPostWX"}, method = {RequestMethod.POST})
    public Actor a4(@RequestBody Map<String, String> map) {
        IActorDao iActorDao = MybatisUtil.getMapper(IActorDao.class);
        System.out.println(map);
        System.out.println("actorIdPost：    "+map.get("actorId"));
        Actor actor= iActorDao.selectById(map.get("actorId"));
        return actor;
    }
}
