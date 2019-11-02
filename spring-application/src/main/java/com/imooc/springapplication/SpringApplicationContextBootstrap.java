package com.imooc.springapplication;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author youyu.song
 * @date 2019/6/16
 */
@SpringBootApplication
public class SpringApplicationContextBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new SpringApplicationBuilder(SpringApplicationContextBootstrap.class)
                        //.web( WebApplicationType.NONE)
                        .run(args);

        System.out.println("ConfigurableApplicationContext 类型：" + context.getClass().getName());
        System.out.println("Environment 类型：" + context.getEnvironment().getClass().getName());

        // 关闭上下文
        context.close();
    }

}
