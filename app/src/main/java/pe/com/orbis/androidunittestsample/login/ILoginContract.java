package pe.com.orbis.androidunittestsample.login;

import pe.com.orbis.androidunittestsample.entity.UserEntity;

/**
 * Created by carlosvargas on 30/12/16.
 *
 */

public interface ILoginContract {

    interface IRequiredViewOps{
        void showToast(String msg);
        void showAlert();
    }

    interface IPresenterOps{
        void insertData();
    }

    interface IRequiredPresenterOps{
        void onUserInserted();
        void onUserRemoved();
    }

    interface IModelOps{
        void insertUser(UserEntity userEntity);
        void removeUser(UserEntity userEntity);
    }
}
