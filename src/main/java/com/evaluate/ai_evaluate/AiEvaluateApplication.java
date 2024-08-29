package com.evaluate.ai_evaluate;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@MapperScan(basePackages = "com.evaluate.ai_evaluate.mapper")
@EnableAsync
@SpringBootApplication

public class AiEvaluateApplication {

    public static void main(String[] args) {
        SpringApplication.run(AiEvaluateApplication.class, args);
    }

}
