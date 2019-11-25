package com.example.mohinhmvp;

public interface LoginView {

    void Login();
    void CheckUserName();
    void CheckPassWord();
    void ShowLoading();
    void HideLoading();

    void navigateMain();
}
