package com.mr.erp_user.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component//注入对象时需注入这个注解
public class RedisUtils<T> {
    @Autowired
    private RedisTemplate redisTemplate;//redis jar包提供

    public void setKeyValue(String key,String value){
        redisTemplate.opsForValue().set(key,value);
    }

    public void setList(String key, List<T> list){
        redisTemplate.opsForList().set(key,0,list);
    }

    public void setHash(String key,String item,T obj){
        redisTemplate.opsForHash().put(key,item,obj);
    }

    public T getHash(String key,String item){
        return (T) redisTemplate.opsForHash().get(key,item);
    }
}
