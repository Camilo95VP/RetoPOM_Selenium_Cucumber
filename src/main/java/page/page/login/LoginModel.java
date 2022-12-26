package page.page.login;

public class LoginModel {

    String email;
    String contraseña;

    public LoginModel(String email, String contraseña) {
        this.email = email;
        this.contraseña=contraseña;
    }

    public LoginModel() {

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String constraseña) {
        this.contraseña = constraseña;
    }
}
