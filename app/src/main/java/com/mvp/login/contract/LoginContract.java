package com.mvp.login.contract;

public interface LoginContract {

    interface Model{
        String getUserName();
        String getPassword();
    }


    interface View{
        void initViews();
        void updateUI(String statusMessage);
    }

    interface Presenter{
        void login(String username,String password);
    }
}
