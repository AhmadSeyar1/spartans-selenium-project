package tek.review;

public class RandomNumber {
    public static void main(String[] args) {
        // 0 - 1

        double random = Math.random();
        System.out.println(random);
        int number = (int) (random * 100000);
        System.out.println(number);
    }
}
