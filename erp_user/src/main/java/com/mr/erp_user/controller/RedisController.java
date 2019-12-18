package com.mr.erp_user.controller;

import com.mr.erp_user.redis.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
@RestController
@RequestMapping("redis")
public class RedisController {

    @Autowired
    private RedisUtils<Map<String,Object>> redisUtils;

    @GetMapping("/testRedis")
    public Map<String,Object> testRedis(){

        Map<String,Object> goods = new HashMap<>();

        goods.put("clothes","Amani");
        goods.put("car","Porchear");
        goods.put("house","BigBigHouse");
        redisUtils.setHash("shoppingcart","王伟",goods);
        Map<String, Object> retParams = redisUtils.getHash("shoppingcart", "王伟");

        goods.put("clothes","Amani1");
        goods.put("car","Porchear1");
        goods.put("house","BigBigHouse1");
        redisUtils.setHash("shoppingcart","wanglei",goods);
        Map<String, Object> retParams1 = redisUtils.getHash("shoppingcart", "wanglei");

        Map<String,Object> retmap = new HashMap<>();
        retmap.put("wanglei",retParams1);
        retmap.put("王伟",retParams);

        return retmap;
    }
}
