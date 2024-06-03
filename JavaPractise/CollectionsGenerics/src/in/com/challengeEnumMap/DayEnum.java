package in.com.challengeEnumMap;

public enum DayEnum {
    SUNDAY("weekend"),
    MONDAY("weekday"),
    TUESDAY("weekday"),
    WEDNESDAY("weekday"),
    THURSDAY("weekday"),
    FRIDAY("weekday"),
    SATURDAY("weekend");

    DayEnum(String dayType) {
        this.dayType = dayType;
    }

    private final String dayType;

    public String getDayType() {
        return dayType;
    }

}
