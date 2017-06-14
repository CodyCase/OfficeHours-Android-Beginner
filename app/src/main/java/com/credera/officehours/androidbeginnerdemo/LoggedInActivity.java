package com.credera.officehours.androidbeginnerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LoggedInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged_in);

        String username;
        String password;

        final Bundle extras = getIntent().getExtras();
        if (extras != null) {
            username = extras.getString(MainActivity.EXTRA_USERNAME);
            password = extras.getString(MainActivity.EXTRA_PASSWORD);
        } else {
            username = "DefaultUsername";
            password = "DefaultPassword";
        }

        final TextView usernameTextView = (TextView) findViewById(R.id.loggedin_username_textview);
        usernameTextView.setText(String.format("Username: %s", username));

        final TextView passwordTextView = (TextView) findViewById(R.id.loggedin_password_textview);
        passwordTextView.setText(String.format("Password: %s", password));
    }
}
