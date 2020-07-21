package com.hello.service;

import com.hello.dao.AccountDao;
import com.hello.enitity.Account;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;

@ManagedBean(name = "myAccountService")
@SessionScoped
public class AccountService {

    @ManagedProperty(value = "#{myAccountDao}")
    private AccountDao accDao;

    public void create(Account account) {
        // tạo muối.
        // mã hóa pass nếu cần
        accDao.insert(account);
    }

    public ArrayList<Account> getList() {

        return accDao.getList();
    }

    public AccountDao getAccDao() {
        return accDao;
    }

    public void setAccDao(AccountDao accDao) {
        this.accDao = accDao;
    }
}
