package pekan7_2511533009;
public class Akun_2511533009 {
    String username,password,email;
    int pinAngka;

    //SETTER
    public void setUsername(String username){
        this.username=username;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setPinAngka(int pinAngka){
        this.pinAngka=pinAngka;
    }

    //GETTER
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public String getEmail(){
        return email;
    }
    public int getPinAngka(){
        return pinAngka;
    }

    //HELPER METHOD
    public boolean isPasswordValid(){
        return password.length()>=8;
    }
    public boolean isEmailValid(){
        return email.contains("@") && email.contains(".") && (!email.startsWith("@") || !email.startsWith("."));
    }
}
