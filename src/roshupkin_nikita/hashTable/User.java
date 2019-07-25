package roshupkin_nikita.hashTable;

public class User extends Object {
    private String login;
    private String pass;

    public User(String login, String pass) {
        this.login = login;
        this.pass = pass;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        User user = (User) obj;
        boolean isNullable = user.login == null || this.login == null ||
                user.pass == null || this.pass == null;
        return !isNullable && user.login.equals(this.login) &&
                user.pass.equals(this.pass);
    }

    @Override
    public int hashCode() {
        int loginHash = this.login.hashCode();
        int passHash = this.pass.hashCode();
        //long doub = Double.doubleToLongBits(1.1);

        return (int) (loginHash + passHash);
    }

    public String toSring() {
        return "Login is " + this.login +" , " + "Password is " + this.pass;
    }
}