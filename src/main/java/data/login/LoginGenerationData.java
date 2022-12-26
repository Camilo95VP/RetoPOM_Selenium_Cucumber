package data.login;

import com.github.javafaker.Faker;
import model.register.RegisterModel;
import page.page.login.LoginModel;

import java.util.Locale;

public class LoginGenerationData {

    public static LoginModel generateLoginData(){
        Faker fk= Faker.instance(new Locale("en-EN"));
        LoginModel login=new LoginModel();
        login.setEmail(fk.internet().emailAddress().trim());
        login.setContraseña(fk.internet().password(7,10).trim());
        return login;
    }
}
