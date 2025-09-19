package src;

public class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
    }

    public void honk() {
        System.out.println("Generic vehicle honk!");
    }

}