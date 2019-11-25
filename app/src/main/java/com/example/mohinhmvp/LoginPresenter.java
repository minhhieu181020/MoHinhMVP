package com.example.mohinhmvp;

public class LoginPresenter {
    private LoginView loginView;

    public LoginPresenter(LoginView loginView) {
        this.loginView = loginView;
    }
    void Login(String username,String password){
        if (username.isEmpty()){
            loginView.CheckUserName();
        }else if (password.isEmpty()){
            loginView.CheckPassWord();
        }
        else if (username.equalsIgnoreCase("adim")&&password.equalsIgnoreCase("admin")){
            loginView.navigateMain();
        }
    }
}
