package in.javapractise;

public class Sample {
    public static void main(String[] args) {
        System.out.println("Hello");
        Car mycar = new Car();
        mycar.setColor("Red");
//        mycar.setCost(999); //since setter is kept as private access I cannot do this
        mycar.setModel("Swift");
        System.out.println(mycar);

        Car secondCar = new Car("Black","BMW",1,5000);
        System.out.println(secondCar);
    }
}
