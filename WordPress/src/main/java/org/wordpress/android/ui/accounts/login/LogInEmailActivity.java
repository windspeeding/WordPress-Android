package org.wordpress.android.ui.accounts.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

import org.wordpress.android.R;
import org.wordpress.android.widgets.WPTextView;

public class LogInEmailActivity extends AppCompatActivity {
    private EditText mEmailEditText;
    private WPTextView mSignUpTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_in_email_activity);

        mEmailEditText = (EditText) findViewById(R.id.nux_email);
        mSignUpTextView = (WPTextView) findViewById(R.id.sign_up);

        mEmailEditText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (keyCode == KeyEvent.KEYCODE_ENTER) {
                    signIn();
                    return true;
                } else {
                    return false;
                }
            }
        });
    }

    private void signIn() {
        String email = mEmailEditText.getText().toString().trim();

        // request email check in WordPress.com

        logInWordPressCom();
    }

    private void logInWordPressCom() {
        
    }

    private void logInSelfHosted() {

    }
}
