public class CallByValue {

    public static void main(String[] args) {
        int x = 4; // these variables are function scoped or block scoped
        int y = 5;

        System.out.println("x: " + x + ", y: " + y);
        addNum(x, y);
        System.out.println("x: " + x + ", y: " + y);
    }

    static void addNum(int x, int y) {
        System.out.println("========AddNum function Block Start========");

        // Only value is being copied. Main function's x and y are different from this one hence the value is not changing
        // Variables are block scoped
        x = x + 10;
        y = y + 10;

        System.out.println("x: " + x + ", y: " + y);

        System.out.println("========AddNum function Block Ends========");
    }


}
