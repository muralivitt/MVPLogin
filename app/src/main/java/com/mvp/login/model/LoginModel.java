package com.mvp.login.model;

import com.mvp.login.contract.LoginContract;

public class LoginModel implements LoginContract.Model{
    @Override
    public String getUserName() {
        return "muralivitt";
    }

    @Override
    public String getPassword() {
        return "Pwd@123";
    }
}
