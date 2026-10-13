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

        Student s1 = new Student("Bhajiya", 8);
        Student s2 = new Student("halua", 2);

        s1.display();
        s2.display();
    }
}
