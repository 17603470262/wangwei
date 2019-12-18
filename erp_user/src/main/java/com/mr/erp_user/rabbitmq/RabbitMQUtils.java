package com.mr.erp_user.rabbitmq;

import com.alibaba.fastjson.JSON;
import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class RabbitMQUtils {

    @Autowired
    private RabbitMessagingTemplate messagingTemplate;

    public void sendMessage(){
        Map<String,Object> messageBody = new HashMap<>();
        messageBody.put("orderName","fanyueyueのorder");
        messageBody.put("orderPrice",100000);
        try {                                       //名字                    key                     装换josn格式
            messagingTemplate.convertAndSend("exchange1906","demo1906", JSON.toJSONString(messageBody));
            System.out.println("发送成功");

        }catch (Exception e){
            System.out.println("发送失败");
        }
    };

}
