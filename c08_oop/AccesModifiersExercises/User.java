package c08_oop.AccesModifiersExercises;

public class User {
    private String username;
    private String password;

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void checkPassword(String inputPassword){
        if(inputPassword.equals(password)){
            this.password = inputPassword;
            System.out.println("Username: " + username);
            System.out.println("Password: " + inputPassword);
        }else{
            System.out.println("Contraseña incorrecta");
        }
    }


}
