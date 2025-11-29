package CoreJava.OOP.encapsulation;

public class User {
   private String username;
   private int password;

    public void setUsername(String username){
        this.username=username;
    }
    public void setPassword(int password){
        this.password=password;
    }
    public String getUsername() {
        if (password == 1234) {
            return username;
        } else {
            return "password is incorrect";
        }
    }
    public int getPassword() {
        return password;
    }

}
