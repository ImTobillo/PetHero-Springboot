package com.pethero.PetHero.model;

import com.pethero.PetHero.types.AccountType;

public class User {
    private int id;
    private String username;
    private String password;
    private AccountType accountType;

    public User(String username, String password, AccountType accountType) {
        this.username = username;
        this.password = password;
        this.accountType = accountType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public AccountType getTipoCuenta() {
        return accountType;
    }

    public void setTipoCuenta(AccountType accountType) {
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", tipoCuenta=" + accountType +
                '}';
    }
}
