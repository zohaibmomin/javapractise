package in.com.challengeEnumMap;

public class TestingDayEnum {
    public static void main(String[] args) {
        for (DayEnum value : DayEnum.values()) {
            System.out.printf("Day is - %s & Day type is %s \n",value,value.getDayType());
        }
    }
}
