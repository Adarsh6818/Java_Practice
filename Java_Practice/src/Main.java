public class Main{
    public static void main(String[] args) {
        // Variable Declaration Syntax: type variableName = value

        String name = "Sexy";

        //Separate initialization and Declaration
        int age; //initialization
        age = 28; //declaration

        //final Keyword: this will declare the variable as "final" or "constant", which means unchangeable and read-only
        final int score = 53;



        System.out.println(name);
        System.out.println("Pajamas have not been");
        System.out.println("Found");
        System.out.println(age);
        System.out.println("Score = " + score);

//        Student s1 = new Student("Derek", 23, 30);
//
//        s1.display();
//        s1.setGrade(90);
//
//        System.out.println("Grade: " + s1.getGrade());

        BankAccount b1 = new BankAccount("Akshay", 4000);

        System.out.println("Hi, " + b1.getOwner() + ". Your account Balance is " + b1.getBalance() + " Euros.");

        b1.deposit(1000);
        b1.withdraw(4500);

    }
}
