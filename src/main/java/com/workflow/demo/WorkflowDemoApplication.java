package com.workflow.demo;

import org.activiti.spring.boot.SecurityAutoConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * 启动类
 * @Author: Elvis
 * @Date: 2019/9/5 21:18
 */
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)//去除冲突
@MapperScan("com.workflow.demo.mapper")
@EnableCaching
public class WorkflowDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(WorkflowDemoApplication.class, args);
    }

}
