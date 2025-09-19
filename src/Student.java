package src;

public class Student {
    private int studentId;
    private String name;
    private String email;

    public Student(int studentId, String name, String email) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void printInfo() {
        System.out.println("Student[id=" + studentId +
                            ", name=" + name +
                            ", email=" + email +"]");
    }

}