package com.changgx;/**
 * Created by Administrator on 2016/10/11.
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Administrator 2016/10/11
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext act=new ClassPathXmlApplicationContext("classpath:spring-quartz.xml");
    }
}
