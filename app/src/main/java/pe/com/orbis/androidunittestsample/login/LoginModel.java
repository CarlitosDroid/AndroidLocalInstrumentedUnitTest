package pe.com.orbis.androidunittestsample.login;

import pe.com.orbis.androidunittestsample.entity.UserEntity;

/**
 * Created by carlosvargas on 2/01/17.
 *
 */

public class LoginModel implements ILoginContract.IModelOps{

    private ILoginContract.IRequiredPresenterOps iRequiredPresenterOps;

    public LoginModel(ILoginContract.IRequiredPresenterOps iRequiredPresenterOps) {
        this.iRequiredPresenterOps = iRequiredPresenterOps;
    }

    @Override
    public void insertUser(UserEntity userEntity) {
        // logic of your application

        iRequiredPresenterOps.onUserInserted();
    }

    @Override
    public void removeUser(UserEntity userEntity) {

    }
}
