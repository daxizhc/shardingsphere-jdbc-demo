package com.shardingsphere.sharding.jpa;

import org.apache.shardingsphere.api.hint.HintManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.shardingsphere.common.CommonService;

@EnableAutoConfiguration
@ComponentScan(basePackages = "com.shardingsphere.jpa")
@EnableJpaRepositories(basePackages = "com.shardingsphere.jpa.dao.repository")
@EntityScan(basePackages = "com.shardingsphere.jpa.dao.entity")
public class JpaShardingMain {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(JpaShardingMain.class, args);
        CommonService studentService = ctx.getBean(CommonService.class);
        studentService.doAction();
//        doInHint(studentService);
        System.out.println("--------------------------------finish--------------------------------");
    }

    private static void doInHint(CommonService studentService) {
        try (HintManager hintManager = HintManager.getInstance()){
            hintManager.addDatabaseShardingValue("student", 123);
            hintManager.addTableShardingValue("student", "234");
            studentService.doAction();
        }
    }

}
