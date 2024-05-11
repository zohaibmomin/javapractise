public class Car {
    int noOfWheels;
    String color;
    float maxSpeed;
    int currentFuel;

    Car(){
        this.color = "black";
        this.maxSpeed = 150;
        this.currentFuel = 2;
        this.noOfWheels = 4;

    }

    Car(String color,float maxSpeed,int currentFuel,int noOfWheels){
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.currentFuel = currentFuel;
        this.noOfWheels = noOfWheels;
    }

    public Car start(){
        if(this.currentFuel == 0){
            System.out.println("Car is out of fuel");
        } else if (this.currentFuel < 5) {
            System.out.println("Car is about to die...Refuel");
        } else if (this.currentFuel >= 5) {
            System.out.println("Car started");
        }
        return this;

    }

    public void carDetails(){
        System.out.println("color is : " + this.color);
        System.out.println("maxSpeed is : " + this.maxSpeed);
        System.out.println("currentFuel is : " + this.currentFuel);
        System.out.println("noOfWheels is : " + this.noOfWheels);

    }
}
