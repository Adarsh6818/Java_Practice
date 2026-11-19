public class StaticKeyword {
    public static void main(String[] args){
        System.out.println("========Main function block start========");

        // Objects created
        Grad_Student gs1 = new Grad_Student("Avinash", 22, 101);
        Grad_Student gs2 = new Grad_Student("Rohit", 23, 102);

        // usage type 2
        Grad_Student.grade = 8;

        // Printing the details of grad student:
        // Type 1 usage demo:
        System.out.println("---------Student Details--------");
        System.out.println("Name: " + gs1.name + ", Age: " + gs1.age + ", Roll Number: " + gs1.rollNumber + ", College: " + Grad_Student.college);
        System.out.println("Name: " + gs2.name + ", Age: " + gs2.age + ", Roll Number: " + gs2.rollNumber + ", College: " + Grad_Student.college);

        // Type 2 usage demo":
        System.out.println("Name: " + gs1.name + ", Grade: " + Grad_Student.grade);
        System.out.println("Name: " + gs2.name + ", Grade: " + Grad_Student.grade);

        // Type 3 usage demo:
        System.out.println("Name: " + gs1.name + ", Uniform: " + Grad_Student.uniform);
        System.out.println("Name: " + gs2.name + ", Uniform: " + Grad_Student.uniform);

        System.out.println("========Main function block ends========");
    }

}

class Grad_Student {
    // Instance Variables
    String name;
    int age;
    int rollNumber;

    // Static Variables
    static int grade;
    static String college; // usage type 1:
    static String uniform = "Tunic";

    Grad_Student (String name, int age, int rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    // Static block (usage type 1 demo)
    static{
        college = "Trinity College Dublin";
    }

}
