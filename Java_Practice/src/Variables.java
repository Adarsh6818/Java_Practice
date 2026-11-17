public class Variables {
    public static void main(String[] args) {
        System.out.println("Learning Variables in Java");

        // -- Variable Declaration --------------------------

        // Integer Data Types
        byte byte_val = 16;
        short short_val = 123;
        int int_val = 1234;
        long long_val = 12345;

        // Real Numbers
        float float_val = 2.3f; // f suffix is used  to describe float variables
        double double_val = 1.77; // Standard way
        double scientific_val = 6.022e23; // 6.022 * 10^23 : Avogardo's Number.

        // Boolean Data type
        boolean bool_val = true; // true or false only

        // Character Data types
        char char_val = 's'; // 'a' --> integer --> binary --> store in memory

        //-- Different number systems -------------------
        // Binary: prefix is --> 0b
        byte binary_val = 0b101; //

        // Octal: prefix is --> 0
        byte octal_val = 07; //

        // Hexadecimal: prefix is --> 0X
        byte hexa_val = 0X7; //

        // String
        String firstName = "Tanjiro";
        String lastName = "Kammado";

        System.out.println("----- Integer data type value -----");

        System.out.println("Value of byte variable: " + byte_val);
        System.out.println("Value of short variable: " + byte_val);
        System.out.println("Value of int variable: " + byte_val);
        System.out.println("Value of long variable: " + byte_val);

        System.out.println("----- Decimal data type value -----");

        System.out.println("----- Boolean data type value -----");

        System.out.println("----- Character data type value -----");


    }
}
