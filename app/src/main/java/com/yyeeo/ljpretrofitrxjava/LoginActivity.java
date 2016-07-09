package com.yyeeo.ljpretrofitrxjava;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity {


//    @BindView(R.id.et_username)
//    AutoCompleteEditTextX etUsername;
//    @BindView(R.id.et_password)
//    EditTextX etPassword;
//    @BindView(R.id.btn_login)
//    Button btnLogin;
//    @BindView(R.id.tv_reg)
//    TextView tvReg;
//    @BindView(R.id.tv_forgot)
//    TextView tvForgot;
//    @BindView(R.id.h)
//    LinearLayout h;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //ButterKnife.bind(this);
        Button btnLogin= (Button) findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();

    }
}
