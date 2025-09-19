package src;

public class Main {
    public static void main(String[] args) {
        Vehicle genericVehicle = new Vehicle("Generic Brand");
        Car car = new Car("Tesla", 4);
        Bicycle bike =new Bicycle("Ontel");
        
        System.out.println("=== Vehicle ===");
        genericVehicle.displayDetails();
        genericVehicle.honk();

        System.out.println();
        System.out.println("=== Car ===");
        car.displayDetails();
        car.honk();

        System.out.println();
        System.out.println("=== Bicycle ===");
        bike.displayDetails();
        bike.honk();

        System.out.println();
        System.out.println("=== Student ===");
        Student undergrad = new Student(101, "Alice", 
                            "alice@school.com");
        GraduateStudent grad = new GraduateStudent(202, "Bob", 
                                "bob@school.com", "Quantum Computing");

        undergrad.printInfo();
        System.out.println();
    
        System.out.println("Grad Student Name: " + grad.getName());
        System.out.println("Grad Student Thesis: " + grad.getThesisTopic());
    }
    
}