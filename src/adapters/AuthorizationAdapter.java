package adapters;

import models.User;
import utilz.BaseDataUtilz;

import java.util.ArrayList;

import static utilz.Constants.GameVaribles.PATH_LOGINS;

public class AuthorizationAdapter extends BaseDataUtilz<User> {

    public void saveData(String login, String password) {
        var data = LoadData(PATH_LOGINS);
        if (data == null) {
            data = new ArrayList<>();
        }
        User user = new User();
        user.setLogin(login);
        user.setPassword(password);
        user.setVisibleName(login);
        data.add(user);
        SaveData(PATH_LOGINS, data);
    }

    public boolean checkData(String login, String password) {
        var data  = LoadData(PATH_LOGINS);
        if (data==null) {
            return false;
        }
        return true;
    }

}
