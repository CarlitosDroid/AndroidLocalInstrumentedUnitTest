package pe.com.orbis.androidunittestsample.login;

import android.os.Bundle;

import pe.com.orbis.androidunittestsample.BaseActivity;
import pe.com.orbis.androidunittestsample.R;

public class LoginActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        startFragment(LoginFragment.newInstance());
    }
}
