package in.com.mapInterfacesEnum;

public enum ColorEnum {
    RED("Stop"),GREEN("Go"),YELLOW("halt");

    private final String action;

    ColorEnum(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }
}
