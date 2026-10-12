import java.util.Random;

public class DieRoller {
    public static void main(String[] args) {

        Random random = new Random();

        int die1;
        int die2;
        int die3;
        int rollCount = 0;
        int sum;
        System.out.printf("%-8s %-8s %-8s %-8s %-8s%n",
                "Roll", "Die1", "Die2", "Die3", "Sum");
        System.out.println("----------------------------------------");
        do {
            rollCount++;

            die1 = random.nextInt(6) + 1;
            die2 = random.nextInt(6) + 1;
            die3 = random.nextInt(6) + 1;

            sum = die1 + die2 + die3;
            System.out.printf("%-8d %-8d %-8d %-8d %-8d%n",
                    rollCount, die1, die2, die3, sum);

        } while (!(die1 == die2 && die2 == die3));
    }
}
