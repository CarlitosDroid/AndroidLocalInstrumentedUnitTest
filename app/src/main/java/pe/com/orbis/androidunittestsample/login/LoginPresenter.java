package pe.com.orbis.androidunittestsample.login;


import android.os.Handler;

import pe.com.orbis.androidunittestsample.entity.UserEntity;

/**
 * Created by carlosvargas on 30/12/16.
 *
 */

class LoginPresenter implements ILoginContract.IPresenterOps, ILoginContract.IRequiredPresenterOps{

    private ILoginContract.IRequiredViewOps iRequiredViewOps;
    private ILoginContract.IModelOps iModelOps;


    LoginPresenter(ILoginContract.IRequiredViewOps iRequiredViewOps) {
        this.iRequiredViewOps = iRequiredViewOps;
        this.iModelOps = new LoginModel(this);
    }

    @Override
    public void insertData() {
        iRequiredViewOps.showToast("Starting process...");

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                iModelOps.insertUser(new UserEntity("Carlos", 25));
            }
        }, 3000);
    }

    @Override
    public void onUserInserted() {
        iRequiredViewOps.showToast("User inserted.");
    }

    @Override
    public void onUserRemoved() {

    }
}
