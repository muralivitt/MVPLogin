package com.mvp.login.presenter;

import com.mvp.login.contract.LoginContract.*;
import com.mvp.login.model.LoginModel;

public class LoginPresenter implements Presenter{

    private View mLoginView;
    private Model mLoginModel;

    public LoginPresenter(View loginView){
        mLoginView = loginView;
        mLoginModel = new LoginModel();
        mLoginView.initViews();
    }

    @Override
    public void login(String username, String password) {
        String statusMessage;
        if(username.equals(mLoginModel.getUserName())
                && password.equals(mLoginModel.getPassword())){
            statusMessage = "Login success !!";
        }else{
            statusMessage = "Login Failed !!";
        }

        mLoginView.updateUI(statusMessage);
    }
}
