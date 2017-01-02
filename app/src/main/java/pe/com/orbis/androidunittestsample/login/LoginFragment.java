package pe.com.orbis.androidunittestsample.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import pe.com.orbis.androidunittestsample.R;
import pe.com.orbis.androidunittestsample.RegisterActivity;

/**
 * Created by carlosvargas on 29/12/16.
 *
 */

public class LoginFragment extends Fragment implements View.OnClickListener, ILoginContract.IRequiredViewOps{

    private ILoginContract.IPresenterOps iPresenterOps;

    public static LoginFragment newInstance(){
        return new LoginFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        iPresenterOps = new LoginPresenter(this);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_login, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        Button btnLogin = (Button) view.findViewById(R.id.btnLogin);
        Button btnRegister = (Button) view.findViewById(R.id.btnRegister);

        btnLogin.setOnClickListener(this);
        btnRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btnLogin){
            iPresenterOps.insertData();
        }else{
            startActivity(new Intent(getActivity(), RegisterActivity.class));
        }
    }

    @Override
    public void showToast(String msg) {
        Toast.makeText(getActivity(), msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showAlert() {

    }
}
