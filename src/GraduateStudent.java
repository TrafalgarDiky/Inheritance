package src;

public class GraduateStudent extends Student {
    private String thesisTopic;

    public GraduateStudent(int studentId, String name, String email, String thesisTopic) {
        super(studentId, name, email);
        this.thesisTopic = thesisTopic;
    }

    public String getThesisTopic() {
        return thesisTopic;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Thesis Topic: " + thesisTopic);
    }
    
}
