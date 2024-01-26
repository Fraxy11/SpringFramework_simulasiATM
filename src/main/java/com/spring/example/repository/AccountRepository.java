package com.spring.example.repository;

import com.spring.example.prjct.Account;

public interface AccountRepository {
    public void update( Account account);

    public Account find(Long id);
}
