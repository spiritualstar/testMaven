package com.ycc.test;

import com.ycc.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: ycc
 * @date: 2022/8/31 - 08 - 31 - 15:10
 * @Description: com.ycc.test
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        User user = (User) applicationContext.getBean("user");
        System.out.println(user.getName() + "----" + user.getPassword());
    }
}
