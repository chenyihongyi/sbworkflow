package com.sbmp.workflow.workflow_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.workflow.demo.mapper")
public class WorkflowDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkflowDemoApplication.class, args);
	}

}
