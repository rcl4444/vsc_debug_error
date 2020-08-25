package com.sample.scheduler;

import org.mybatis.spring.annotation.MapperScan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sample.scheduler.dao")
public class StatsSchedulerApp {
    public static void main(String[] args) {
        SpringApplication.run(StatsSchedulerApp.class, args);
        System.out.println("scheduler started");
    }
}
