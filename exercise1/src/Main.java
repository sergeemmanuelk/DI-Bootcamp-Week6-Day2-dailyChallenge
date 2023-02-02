import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // create a new random number generator object
        Random rand = new Random();

        // pick a random number between 0 and 1:
        int n = rand.nextInt(2);
        System.out.println("Picked random value " + n);

        if (n == 0) {
            System.out.println("Heads");
        } else {
            System.out.println("Tails");
        }
    }
}