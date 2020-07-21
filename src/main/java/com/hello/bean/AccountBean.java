package com.hello.bean;

import com.hello.enitity.Account;
import com.hello.service.AccountService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class AccountBean {

    @ManagedProperty(value = "#{myAccountService}")
    private AccountService accountService;

    private String username;
    private String password;

    public AccountService getAccountService() {
        return accountService;
    }

    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String register() {
        Account account = new Account(username, password);
        accountService.create(account);
        return "list";
    }
}

/*
package com.hello.bean;

import com.hello.enitity.Account;
import com.hello.service.AccountService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class AccountBean {

    @ManagedProperty(value = "#{myAccountService}")
    private AccountService accountService;

    private String username;
    private String password;

    public AccountService getAccountService() {
        return accountService;
    }

    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

    public String register() {
        Account account = new Account(username, password);
        accountService.create(account);
        return "list";
    }

    public String login() {
        return "success?faces-redirect=true";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
*/

