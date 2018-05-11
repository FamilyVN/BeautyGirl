package com.tuananh.family.beautygirl.view.activity.login;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.tuananh.family.beautygirl.R;
import com.tuananh.family.beautygirl.databinding.ActivityLoginBinding;
import com.tuananh.family.beautygirl.view.activity.home.HomeActivity;

public class LoginActivity extends AppCompatActivity {
    private ActivityLoginBinding mBinding;
    private LoginViewModel mModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initDataBinding();
        initViews();
    }


    private void initDataBinding() {
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        mModel = new LoginViewModel();
        mBinding.setViewModel(mModel);
        mBinding.setListener(this);
        mBinding.executePendingBindings();
    }

    private void initViews() {
    }

    public void onLoginSuccess() {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
        finish();
    }

    // login have four type
    public void onLoginFacebook() {
        onLoginSuccess();
    }

    public void onLoginGmail() {
        onLoginSuccess();
    }

    public void onLoginPhone() {
        onLoginSuccess();
    }

    public void onLoginEmail() {
        onLoginSuccess();
    }

}
