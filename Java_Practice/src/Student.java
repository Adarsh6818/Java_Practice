public class Student {
    String name_1;
    int grade_1;

    Student(String name, int grade) {
        this.name_1 = name;
        this.grade_1 = grade;
    }

    void display() {
        System.out.println(name_1 + " grade: " + grade_1);
    }
}
