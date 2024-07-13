package com.bankapp.bankapp.service;

import com.bankapp.bankapp.model.Transaction;

import java.util.List;

public interface TransactionService {
    Transaction saveTransaction(Transaction transaction);
    List<Transaction> findByAccountId(Long accountId);
    List<Transaction> findByAccountNumber(String accountNumber);
}
