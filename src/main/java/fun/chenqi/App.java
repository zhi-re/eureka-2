package fun.chenqi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 *
 */
@EnableEurekaServer
@SpringBootApplication //当前启动类是配置类
public class App {
    public static void main(String[] args) {
        // 写本类的字节码【为的就是找到启动类上的注解】
        // run方法里面做的事情是初始化Spring框架
        SpringApplication.run(App.class, args);
    }
}