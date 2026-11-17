package com.bank.account;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/internal/accounts")
public class AccountController {

    @GetMapping
    public String getAccounts() {
        return "Bank Accounts Retrieved Successfully";
    }
}
