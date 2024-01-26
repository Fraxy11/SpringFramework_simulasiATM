package com.spring.example.service;

import java.math.BigDecimal;

import com.spring.example.prjct.Account;

public interface AccountService {

    public void transferMoney(Long sourceId,Long destinationId,BigDecimal balance);
    public Account getAccount(Long id);
    }

