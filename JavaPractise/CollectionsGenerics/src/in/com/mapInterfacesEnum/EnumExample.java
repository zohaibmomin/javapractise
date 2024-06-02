package in.com.mapInterfacesEnum;

public class EnumExample {
    public static void main(String[] args) {
//        System.out.println(ColorEnum.valueOf("GREEN"));

        for (ColorEnum value : ColorEnum.values()) {
            System.out.println(value);
        }
    }
}
