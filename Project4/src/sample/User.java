package sample;

public class User {
    String password, userName;

    public User(){}

    public User(String password, String userName) {
        this.password = password;
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
