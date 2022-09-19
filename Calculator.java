import java.util.Scanner;

class lektier {

    public static void main(String[] args) {
        System.out.println("Pick a number between 1 and 10");
        Scanner scanner = new Scanner(System.in);

        int inputtedNum = scanner.nextInt();

        if (inputtedNum <= 5) {
            System.out.println("Wow random text");
        } else {
            System.out.println("Wow anden random text");
        }
    }
}