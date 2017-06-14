package com.credera.officehours.androidbeginnerdemo;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_USERNAME = "username";
    public static final String EXTRA_PASSWORD = "password";

    private Button mLoginButton;
    private TextInputEditText mUsernameEditText;
    private TextInputEditText mPasswordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUsernameEditText = (TextInputEditText) findViewById(R.id.login_username_edittext);
        mPasswordEditText = (TextInputEditText) findViewById(R.id.login_password_edittext);

        mLoginButton = (Button) findViewById(R.id.login_button);
        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String username = mUsernameEditText.getText().toString();
                final String password = mPasswordEditText.getText().toString();

                final Intent intent = new Intent(MainActivity.this, LoggedInActivity.class);
                intent.putExtra(EXTRA_USERNAME, username);
                intent.putExtra(EXTRA_PASSWORD, password);

                startActivity(intent);
            }
        });
    }
}
