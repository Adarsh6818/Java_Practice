public class CallByReference {
    public static void main(String[] args){

        Random r1 = new Random(4, 5);

        System.out.println("x: " + r1.x + ", y: " + r1.y);
        addNum(r1.x, r1.y);
        System.out.println("x: " + r1.x + ", y: " + r1.y);
    }

    static void addNum(Random r) {
        System.out.println("========AddNum function Block Start========");

        // Only value is being copied. Main function's x and y are different from this one hence the value is not changing
        // Variables are block scoped
        r.x = r.x + 10;
        r.y = r.y + 10;

        System.out.println("x: " + x + ", y: " + y);

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