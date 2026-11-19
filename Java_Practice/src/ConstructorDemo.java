public class ConstructorDemo {
    public static void main(String[] args){
        System.out.println("-----------Constructor Demo-----------");

        StudentDetails s1 = new StudentDetails(); // Assign all the default values
//        StudentDetails s2 = new StudentDetails("Aditya"); // Assign name and rest default values
//        StudentDetails s3 = new StudentDetails("Rahul", 23); // assign name and age and rest will be default values
//        StudentDetails s4 = new StudentDetails("Abhishek", 21, 201); // same as above
//        StudentDetails s5 = new StudentDetails("Nikhil", 22, 202, "GGITS" ); // same as above

        System.out.println("Student Details: ");
        System.out.println("s1: " + s1.name + ", " + s1.age + ", " + s1.rollNumber + ", " + s1.college); // Default values
//        System.out.println("s2: " + s2.name + ", " + s2.age + ", " + s2.rollNumber + ", " + s2.college);
//        System.out.println("s3: " + s3.name + ", " + s3.age + ", " + s3.rollNumber + ", " + s3.college);
//        System.out.println("s4: " + s4.name + ", " + s4.age + ", " + s4.rollNumber + ", " + s4.college);
//        System.out.println("s5: " + s5.name + ", " + s5.age + ", " + s5.rollNumber + ", " + s5.college);

    }

}

class StudentDetails {
    String name;
    int age;
    int rollNumber;
    String college;

    // Constructor Chaining using this();

    /* Two types:
        1. Every constructor is connected to the biggest constructor
        2. Every constructor is connected to next big constructor
    */

    // Default Constructor
    StudentDetails (){
  //      this("Unknown", 0,000,"Unknown");
        this("Unknown");
        System.out.println("Inside first Constructor");
    }

    // Parameterized Constructor

    StudentDetails(String name) {
//        this.name = name;
 //       this(name, 0, rollNumber = 000, college = "Unknown");
        this(name, 0);
        System.out.println("Inside Second Constructor");
    }

    StudentDetails(String name , int age) {
//        this.name = name;
//        this.age = age;
//        this(name, age, rollNumber = 0, college = "Unknown");
         this(name, age, 0);
        System.out.println("Inside third Constructor");
    }

    StudentDetails(String name , int age, int rollNumber) {
//        this.name = name;
//        this.age = age;
//        this.rollNumber = rollNumber;
        this(name, age, rollNumber, college = "Unknown");
        System.out.println("Inside fourth Constructor");
    }

    StudentDetails(String name , int age, int rollNumber, String college) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.college = college;
        System.out.println("Inside fifth Constructor");
    }


}
