package com.bankapp.bankapp.service;

import com.bankapp.bankapp.model.Account;
import com.bankapp.bankapp.model.User;

import java.util.Optional;

public interface AccountService {
    Account saveAccount(Account account);
    Optional<Account> findByAccountId(Long id);
    Optional<Account> findByUser(User user);

}
