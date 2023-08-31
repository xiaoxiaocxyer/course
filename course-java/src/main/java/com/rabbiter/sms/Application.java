package com.rabbiter.sms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.rabbiter.sms.dao")
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

}
