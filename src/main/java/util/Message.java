package util;

public enum Message {

    MESSAGE_CONTACT_SUCCESFULL("Your enquiry has been successfully sent to the store owner."),

    MESSAGE_REGISTER_SUCCESFULL ("Your registration completed"),

    MESSAGE_LOGIN_ALERT("Login was unsuccessful. Please correct the errors and try again.\n" +
            "No customer account found"),
    EMAIL_LOGUED("manuel@gmail.com"),

    MESSAGE_KEY_ERROR("The password and confirmation password do not match."),

    MESSAGE_EMAIL_ERROR("Wrong email");

    private final String value;

    public String getValue() {
        return value;
    }

    Message(String value){
        this.value=value;
    }
}
