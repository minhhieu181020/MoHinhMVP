package com.example.mohinhmvp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements LoginView {
private EditText edUser,edPass;
private Button btnLogin;
private LoginPresenter loginPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edPass=findViewById(R.id.edPassword);
        edUser=findViewById(R.id.edUsername);
        btnLogin=findViewById(R.id.btnLogin);
        loginPresenter=new LoginPresenter(this);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username=edUser.getText().toString().trim();
                String password=edPass.getText().toString().trim();
                loginPresenter.Login(username,password);
            }
        });
    }

    @Override
    public void Login() {


    }

    @Override
    public void CheckUserName() {
        edUser.setError("Vui long nhap UserName !!!");


    }

    @Override
    public void CheckPassWord() {
        edPass.setError("Vui long nhap PassWord !!!");
    }

    @Override
    public void ShowLoading() {

    }

    @Override
    public void HideLoading() {

    }

    @Override
    public void navigateMain() {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
