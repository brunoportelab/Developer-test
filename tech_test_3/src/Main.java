public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("'A' equals " + a + " and 'B' equals " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After the swap, 'A' equals " + a + " and 'B' equals " + b);
    }
}