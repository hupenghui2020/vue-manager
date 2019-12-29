package com.hph.vuemanager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author hph
 */
@SpringBootApplication
@MapperScan("com.hph.vuemanager.mapper")
public class VueManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(VueManagerApplication.class, args);
    }

}
