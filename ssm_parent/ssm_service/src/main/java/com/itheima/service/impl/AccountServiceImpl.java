package com.itheima.service.impl;

import com.itheima.domain.Account;

import com.itheima.mapper.AccountMapper;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("AccountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    public void save(Account account) {
        accountMapper.save(account);
    }

    public List<Account> findAll() {
        return accountMapper.findAll();
    }
}
