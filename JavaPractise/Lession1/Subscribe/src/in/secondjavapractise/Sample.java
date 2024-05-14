package in.secondjavapractise;

import in.javapractise.Car;

public class Sample {
    public static void main(String[] args) {
        in.javapractise.Sample sc = new in.javapractise.Sample();
        System.out.println("Hello first java practise : " + sc);
        in.secondjavapractise.Sample sc2 = new in.secondjavapractise.Sample();
        System.out.println("Hello Second java practise : " + sc2);


        //Trying to access Class Car in 1st package
        System.out.println("Hello");
        Car mycar = new Car();
        mycar.setColor("Grey");//Able to access Color using setter because property color is private
//        mycar.model = "Swift"; Cannot access because model is set default
        System.out.println(mycar);

        Car secondCar = new Car("Black","BMW",1,5000);
        System.out.println(secondCar);
    }
}
