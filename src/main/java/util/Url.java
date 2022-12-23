package util;

public enum Url {

    DEMO_WEB_SHOP_URL("https://demowebshop.tricentis.com/"),
    DEMO_WEB_SHOP_REGISTER_URL("https://demowebshop.tricentis.com/register");

    private final String value;

    public String getValue() {
        return value;
    }

    Url(String value){
        this.value=value;
    }
}
