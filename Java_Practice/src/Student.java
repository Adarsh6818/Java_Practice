public class Student {

    // Variables
    private String name_1;
    private int age_1;
    private int grade_1;

    // Constructor
    Student(String name, int age, int grade) {
     setName(name);
     setAge(age);
     setGrade(grade);
    }

    //Methods - getters
    public String getName() {
        return name_1;
    }

    public int getAge() {
        return age_1;
    }

    public int getGrade() {
        return grade_1;
    }

    // Methods - Setters
    public void setName(String name) {
        if(name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name_1 = name;
    }

    public void setAge(int age) {
        if(age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age_1 = age;
    }

    public void setGrade(int grade) {
        if(grade < 0 || grade > 100) {
            throw new IllegalArgumentException("Grade must be between 0 and 100");
        }
        this.grade_1 = grade;
    }

    public void display() {
        System.out.println(name_1 + " (age " + age_1 + ") - grade: " + grade_1);
    }
}
