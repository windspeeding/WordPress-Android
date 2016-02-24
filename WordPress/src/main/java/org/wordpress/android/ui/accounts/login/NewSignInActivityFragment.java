package org.wordpress.android.ui.accounts.login;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

import org.wordpress.android.R;
import org.wordpress.android.widgets.WPTextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class NewSignInActivityFragment extends Fragment {
    public static final String EMAIL_ARG = "email_arg";

    private NewSignInActivity mActivity;
    private EditText mEmailEditText;
    private WPTextView mSignUpTextView;
    private String mEmail;

    public NewSignInActivityFragment(NewSignInActivity activity) {
        mActivity = activity;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_new_sign_in, container, false);
        mEmailEditText = (EditText) view.findViewById(R.id.nux_email);
        mSignUpTextView = (WPTextView) view.findViewById(R.id.sign_up);

        mEmailEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    signIn();
                    return true;
                } else {
                    return false;
                }
            }
        });

        mSignUpTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        return view;
    }



    private void signIn() {
        mEmail = mEmailEditText.getText().toString().trim();

        // request email check in WordPress.com

        mActivity.logInWordPressCom();
    }
}
