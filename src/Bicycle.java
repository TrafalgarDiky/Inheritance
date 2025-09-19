package src;
public class Bicycle extends Vehicle {
    public Bicycle(String brand) {
        super(brand);
    }

    @Override
    public void honk() {
        System.out.println("Ring, ring!");
    }
    
}