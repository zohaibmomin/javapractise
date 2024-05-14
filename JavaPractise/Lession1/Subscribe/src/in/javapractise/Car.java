package in.javapractise;

public class Car {
    private String color;
    String model;
    private int fuel;
    private int cost;

    public Car() {
    }

    public Car(String color, String model, int fuel, int cost) {
        this.color = color;
        this.model = model;
        this.fuel = fuel;
        this.cost = cost;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("color='").append(color).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", fuel=").append(fuel);
        sb.append(", cost=").append(cost);
        sb.append('}');
        return sb.toString();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getCost() {
        return cost;
    }

    //keep set cost as private
    private void setCost(int cost) {
        this.cost = cost;
    }
}
