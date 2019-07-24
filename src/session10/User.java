package session10;

public class User extends Object {
    private String login;
    private String pass;

    public User(String login, String pass) {
        this.login = login;
        this.pass = pass;
    }

    public static void main(String[] args) {
        User user1 = new User("1", "2");
        User user2 = new User("2", "1");
        System.out.println(user1.equals(user2));
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
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
}
