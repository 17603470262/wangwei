package com.mr.erp_user.rabbitmq;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class RabbitMQConfigure {

    /*/**
    * @Description: setExchange 创建对应的队列
    * @Param: []
    * @return: org.springframework.amqp.core.Queue
    * @Author: yxy
    * @Date: 2019/12/16
    */
//    @Bean
//    public Queue setQueue(){
//        return new Queue("demo1905");
//    }

    /**
     * setExchange创建Exchange也就是Q
     * 按照routingkey分发到指定队列
     * @return
     */
//    @Bean
//    public Exchange setExchange(){
//        return new DirectExchange("exchange1905");
//    }
//
//    @Bean
//    public void bindExchangeAndQueue(){
//        BindingBuilder.bind(setQueue()).to(setExchange()).with("demo1905");
//    }

}
