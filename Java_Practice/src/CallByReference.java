public class CallByReference {
    public static void main(String[] args){

        Random r1 = new Random(4, 5);

        System.out.println("========Main function Block Start========");
        System.out.print("Value of r1: " + r1);
        System.out.println("x: " + r1.x + ", y: " + r1.y);
        addNum(r1);
        System.out.println("x: " + r1.x + ", y: " + r1.y);
        System.out.println("========Main function Block Ends========");

    }

    static void addNum(Random r) {
        System.out.println("========AddNum function Block Start========");
        System.out.print("Value of r: " + r);
        // Here also the value is being copied but object reference variable stores the address. So, both r and r1 are pointing to same address and that is why the value is changing.
        // Variables are block scoped
        r.x = r.x + 10;
        r.y = r.y + 10;

        System.out.println("x: " + r.x + ", y: " + r.y);

        System.out.println("========AddNum function Block Ends========");
    }


}

class Random {
    int x;
    int y;

    Random (int x, int y) {
        this.x = x;
        this.y = y;
    }
}