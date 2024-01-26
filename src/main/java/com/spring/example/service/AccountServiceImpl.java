package com.spring.example.service;

import java.math.BigDecimal;

import com.spring.example.prjct.Account;
import com.spring.example.repository.AccountRepository;

public class AccountServiceImpl implements AccountService{

        private AccountRepository accountRepository;
        public void transferMoney(Long sourceId, Long destinationId,BigDecimal balance){
        Account sourceAccount = accountRepository.find(sourceId);
        Account destinationAccount = accountRepository.find(destinationId);
        sourceAccount.setBalance(sourceAccount.getBalance().subtract(balance));
        destinationAccount.setBalance(destinationAccount.getBalance().add(balance));
        }
        @Override
        public Account getAccount(Long id){
        return accountRepository.find(id);
    
        }
        public AccountRepository getAccountRepository() {
            return accountRepository;
        }
        public void setAccountRepository(AccountRepository accountRepository) {
            this.accountRepository = accountRepository;
        }
        // @Override
        // public void transferMoney(Long sourceId, Long destinationId, BigDecimal balance) {
        //     throw new UnsupportedOperationException("Unimplemented method 'transferMoney'");
        // }
    }
    


