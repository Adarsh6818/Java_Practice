public class Student {
    String name;
    int grade;

    Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    void display() {
        System.out.println(name + " grade: " + grade);
    }
}
