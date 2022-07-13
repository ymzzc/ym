package com.jiangfan.bill;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Slf4j
@SpringBootApplication
@EnableTransactionManagement
public class BillApplication {

    public static void main(String[] args) {
        SpringApplication.run(BillApplication.class, args);
        log.info("账单系统启动成功。。。");
    }

}
