package com.mvp.login.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.mvp.login.R;
import com.mvp.login.contract.LoginContract;
import com.mvp.login.contract.LoginContract.*;
import com.mvp.login.presenter.LoginPresenter;

/**
 * Created by Murali M (https://github.com/shliama).
 */
public class MainActivity extends AppCompatActivity implements LoginContract.View {

    private EditText etUserName;
    private EditText etPassword;
    private Button btnLogin;

    private Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPresenter = new LoginPresenter(this);
    }

    @Override
    public void initViews() {
        etUserName = findViewById(R.id.etUserName);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = etUserName.getText().toString();
                String password = etPassword.getText().toString();

                mPresenter.login(username, password);
            }
        });
    }

    @Override
    public void updateUI(String statusMessage) {
        Toast.makeText(this, statusMessage, Toast.LENGTH_LONG).show();
    }
}
