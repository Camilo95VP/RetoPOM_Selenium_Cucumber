package util;

public enum Message {

    MESSAGE_CONTACT_SUCCESFULL("Your enquiry has been successfully sent to the store owner."),
    
    MESSAGE_REGISTER_UNSUCESSFULL("Para continuar debes marcar \"He leído y acepto las políticas\"."),

    MESSAGE_LOGIN_ALERT("Indica usuario y clave."),

    MESSAGE_LOGIN_ERROR("Datos incorrectos o cuenta de usuario no activada."),

    MESSAGE_KEY_ERROR("Las claves no coinciden."),

    MESSAGE_EMAIL_ERROR("Wrong email");
    private final String value;

    public String getValue() {
        return value;
    }

    Message(String value){
        this.value=value;
    }
}