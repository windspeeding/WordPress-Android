package org.wordpress.android.ui.accounts.login;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import org.wordpress.android.R;

public class NewSignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in_activity);

        NewSignInActivityFragment fragment = new NewSignInActivityFragment(this);

        android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.sign_in_container, fragment);
        fragmentTransaction.commit();
    }

    public void logInWordPressCom() {
        LoginWordPressComFragment loginWordPressComFragment = new LoginWordPressComFragment();

        android.support.v4.app.FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, loginWordPressComFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    public void logInSelfHosted() {

    }

}
