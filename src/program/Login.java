package program;
public class Login {
private String username;
private String password;
public Login(){
username = "admin";
password = "12345";
}
public Login(String username, String password){
this.username = username;
this.password = password;
}
public void setUsername(String username) {
this.username = username;
}
public void setPassword(String password) {
this.password = password;
}
public String getUsername() {
return username;
}
public String getPassword() {
return password;
}
}