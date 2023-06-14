package com.sample.demo.rpc.consumer.test;

import com.sample.demo.rpc.provider.export.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @description:
 * @author: sample
 * @date: 2023/6/14
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config.xml")
public class ConsumerTest {

    private Logger logger = LoggerFactory.getLogger(ConsumerTest.class);

    @Resource
    private HelloService helloService;

    @Test
    public void hi() {
        String hi = helloService.hi();
        logger.info("测试结果：{}", hi);
        System.out.println(hi);
    }

}

