package com.spring.example.repository;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import com.spring.example.prjct.Account;

public class AccountRepositoryimpl implements AccountRepository{



    private Map<Long, Account> accountMap = new HashMap<Long,Account>();
    {
        Account account1 = new Account();
        account1.setId(1L);
        account1.setAccountNumber("001");
        account1.setName("Putro");
        account1.setBalance(new BigDecimal(100000));

        Account account2 = new Account();
        account2.setId(2L);
        account2.setAccountNumber("002");
        account2.setName("Fajar");
        account2.setBalance(new BigDecimal(250000));


        accountMap.put(account1.getId(),account1);
        accountMap.put(account2.getId(),account2);
    }
   
   
    @Override
    public void update(Account account){
        accountMap.put(account.getId(),account);
    }


    @Override
    public Account find(Long id) {
        return accountMap.get(id);
}
}