package com.bankapp.bankapp.controller;

import com.bankapp.bankapp.model.Transaction;
import com.bankapp.bankapp.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping("/create")
    public ResponseEntity<Transaction> createTransaction(@RequestBody Transaction transaction) {
        Transaction savedTransaction = transactionService.saveTransaction(transaction);
        return ResponseEntity.ok(savedTransaction);
    }

    @GetMapping("/account/{accountId}")
    public ResponseEntity<List<Transaction>> getTransactionsByAccountId(@PathVariable Long accountId) {
        List<Transaction> transactions = transactionService.findByAccountId(accountId);
        return ResponseEntity.ok(transactions);
    }

    @GetMapping("/account/number/{accountNumber}")
    public ResponseEntity<List<Transaction>> getTransactionsByAccountNumber(@PathVariable String accountNumber) {
        List<Transaction> transactions = transactionService.findByAccountNumber(accountNumber);
        return ResponseEntity.ok(transactions);
    }
}
