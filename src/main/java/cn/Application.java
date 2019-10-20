package cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("cn.xhy.mapper")
public class Application {
    public static void main(String[] args) {
        System.out.println("hello guys!");///adfadsf
        SpringApplication.run(Application.class,args);
    }
}
