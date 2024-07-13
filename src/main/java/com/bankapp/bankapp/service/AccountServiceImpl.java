package com.bankapp.bankapp.service;


import com.bankapp.bankapp.model.Account;
import com.bankapp.bankapp.model.User;
import com.bankapp.bankapp.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Account saveAccount(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public Optional<Account> findByAccountNumber(String accountNumber) {
        return accountRepository.findByAccountNumber(accountNumber);
    }

    @Override
    public Optional<Account> findByAccountId(Long id) {
        return accountRepository.findById(id);
    }

    @Override
    public Optional<Account> findByUser(User user) {
        return accountRepository.findByUser(user);
    }
}

