public class StaticKeyword {
    public static void main(String[] args){
        System.out.println("========Main function block start========");

        // Objects created
        Grad_Student gs1 = new Grad_Student("Avinash", 22, 101);
        Grad_Student gs2 = new Grad_Student("Rohit", 23, 102);

        // Printing the details of grad student:


        System.out.println("========Main function block ends========");
    }

}

class Grad_Student {
    String name;
    int age;
    int rollNumber;
    static String college;

    Grad_Student (String name, int age, int rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    // Static block
    static{
        college = "Trinity College Dublin";
    }

}
