public class MainTest {

    public static void main(String[] args) {

        int result = Main.add(10, 20);

        if (result == 30) {
            System.out.println("TEST PASSED!");
        } else {
            throw new RuntimeException("TEST FAILED!");
        }
    }
}
