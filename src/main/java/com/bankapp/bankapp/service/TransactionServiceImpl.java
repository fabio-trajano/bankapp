package com.bankapp.bankapp.service;

import com.bankapp.bankapp.model.Transaction;
import com.bankapp.bankapp.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public Transaction saveTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    @Override
    public List<Transaction> findByAccountId(Long accountId) {
        return transactionRepository.findByAccountId(accountId);
    }

    @Override
    public List<Transaction> findByAccountNumber(String accountNumber) {
        return transactionRepository.findByAccountNumber(accountNumber);
    }
}
