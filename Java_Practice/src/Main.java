public class Main{
    public static void main(String[] args) {

        // Class and Object Demo -

        Student s1 = new Student("Derek", 23, 30);

        s1.display();
        s1.setGrade(90);

        System.out.println("Grade: " + s1.getGrade());


        // Encapsulation Example -

        BankAccount b1 = new BankAccount("Akshay", 4000);

        System.out.println("Hi, " + b1.getOwner() + ". Your account Balance is " + b1.getBalance() + " Euros.");

        b1.deposit(1000);
        b1.withdraw(4500);

        //Inheritance Example and Practice -

        Shape[] shapes = {
                new Circle(4),
                new Rectangle(10, 12),
                new Circle(5)
        };

        for (Shape s : shapes) {
            System.out.printf("%s area: %.2f%n", s.getName(), s.area());
        }
    }
}
