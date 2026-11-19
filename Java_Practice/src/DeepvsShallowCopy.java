public class DeepvsShallowCopy {
    public static void main(String[] args){

        Copy c1 = new Copy(4, 5);
        Copy c2 = new Copy(c1); // Deep Copy
        Copy c3 = c1; // Shallow Copy

        System.out.println("========Main function Block Start========");
        System.out.println("Value of c1: " + c1); // address abc
        System.out.println("Value of c2: " + c2); // address xyz //
        System.out.println("Value of c3: " + c3); // address abc : This is Shallow copy in which only address is being copied
        System.out.println(" C2 x: " + c2.x + ", y: " + c2.y);
        addNum(c1);
        addNum(c2);
        addNum(c3);
        System.out.println("c1 of x: " + c1.x + ", y: " + c1.y);
        System.out.println("========Main function Block Ends========");

    }

    static void addNum(Copy c) {
        System.out.println("========AddNum function Block Start========");
        System.out.println("Value of c: " + c);
        // Here also the value is being copied but object reference variable stores the address. So, both c and c1 are pointing to same address and that is why the value is changing.
        // Variables are block scoped
        c.x = c.x + 10;
        c.y = c.y + 10;

        System.out.println("x: " + c.x + ", y: " + c.y);

        System.out.println("========AddNum function Block Ends========");
    }
}

class Copy {
    int x;
    int y;

    // Parameterised Constructor
    Copy (int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Constructor with Object type of same class
    Copy (Copy c) {
        this.x = c.x;
        this.y = c.y;
    }

}
