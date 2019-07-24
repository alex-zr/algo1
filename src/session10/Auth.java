package session10;

import java.util.HashMap;
import java.util.Map;

public class Auth {
    private Map<String, String> users;

    public Auth() {
        this.users = new HashMap<>();
        this.users.put("1", "2");
    }

    public boolean isAuth(String login, String pass) {
        String existPass = users.get(login);
        return existPass != null && existPass.equals(pass);
/*        if (existPass != null && existPass.equals(pass)) {
            return true;
        }
        return false;*/
    }
}
