public class Main {
    public static void main(String[] args) {

        for (int count = 0; count <= 30; count++) {
            System.out.print(count + " ");
        }

        System.out.println();

        System.out.println("Task 2: Count Down from 30 to 0");

        for (int count = 30; count >= 0; count--) {
            System.out.print(count + " ");
        }

        System.out.println();

        System.out.println("Task 3: Count Up by 3 from 0 to 18");

        for (int count = 0; count <= 18; count += 3) {
            System.out.print(count + " ");
        }

        System.out.println();

        System.out.println("Task 4: Count Down by 2 from 10 to 0");

        for (int count = 10; count >= 0; count -= 2) {
            System.out.print(count + " ");
        }

        System.out.println();

        System.out.println("Task 5: Square Pattern");

        for (int row = 1; row <= 5; row++) {
            for (int column = 1; column <= 5; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
            System.out.println("Task 6: Triangle Pattern");

            for (int row = 1; row <= 5; row++) {
                for (int column = 1; column <= row; column++) {
                    System.out.print("* ");
                }
                System.out.println();
            } // Closes Task 6 outer loop

        System.out.println();

        System.out.println("Task 7: Inverted Triangle Pattern");

        for (int row = 5; row >= 1; row--) {
            for (int column = 1; column <= row; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    } // Closes the main method
} // Closes the Main class