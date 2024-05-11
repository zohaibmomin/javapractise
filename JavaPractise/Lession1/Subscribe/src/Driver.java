public class Driver {
    String name;

    public static void main(String[] args) {
        Car myCar = new Car("blue", 90.3F,8,3);
        Car start = myCar.start();
        start.carDetails();

    }
}
