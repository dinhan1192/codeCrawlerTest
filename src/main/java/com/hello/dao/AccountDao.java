package com.hello.dao;

import com.hello.enitity.Account;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;

@ManagedBean(name = "myAccountDao")
@SessionScoped
public class AccountDao {
    private ArrayList<Account> list = new ArrayList<Account>();

    public void insert(Account account){
        this.list.add(account);
    }

    public ArrayList<Account> getList() {
        return this.list;
    }
}
