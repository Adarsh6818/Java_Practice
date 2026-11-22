//import collegePackage.Student;
//import schoolPackage.Student;
import schoolPackage.*;

// Syntax = import packageName.className;

public class PackageDemo {
    public static void main(String[] args) {

        //Student s1 = new Student();
        //s1.print();

        schoolPackage.Student s2 = new schoolPackage.Student();
        s2.print();

        collegePackage.Student s3 = new collegePackage.Student();
        s3.print();

        Teacher t1 = new Teacher();
        t1.print();
    }
}
