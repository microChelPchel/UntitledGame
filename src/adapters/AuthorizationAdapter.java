package adapters;

import models.User;
import utilz.BaseDataUtilz;

import java.util.ArrayList;

import static utilz.Constants.GameVaribles.PATH_LOGINS;

public class AuthorizationAdapter extends BaseDataUtilz<User> {

    public boolean saveData(String login, String password) {
        if (password.isEmpty()) {
            return false;
        }
        var data = LoadData(PATH_LOGINS);
        if (data == null) {
            data = new ArrayList<>();
        }
        if (data.stream().noneMatch(item -> item.getLogin().equals(password))) {
            return false;
        }
        User user = new User();
        user.setLogin(login);
        user.setPassword(password);
        user.setVisibleName(login);
        data.add(user);
        SaveData(PATH_LOGINS, data);
        return true;
    }

    public boolean checkData(String login, String password) {
        var data  = LoadData(PATH_LOGINS);
        if (data == null && data.stream().anyMatch(item -> item.getLogin().equals(login) && item.getPassword().equals(password))) {
            return false;
        }

        return true;
    }

}
