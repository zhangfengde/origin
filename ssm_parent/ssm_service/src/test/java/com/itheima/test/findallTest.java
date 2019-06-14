package com.itheima.test;

import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class findallTest {
    @Test
    public void findAllTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath*:applicationContext*.xml");
        AccountService accountService = applicationContext.getBean(AccountService.class);
        List<Account> all = accountService.findAll();
        System.out.println(all);
    }
}
