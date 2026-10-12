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
    }
}
