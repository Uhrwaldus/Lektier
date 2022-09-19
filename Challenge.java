import java.nio.file.attribute.UserPrincipal;
import java.util.Scanner;

public class Challenge {

    public static void main(String[] args) {
        String question = "Hvem er den mest introverte";
        String choiceOne = "Mikkel";
        String choiceTwo = "Rasmus";
        String choiceThree = "Lucas";

        String correctAnswer = choiceTwo;

        System.out.println(question);
        System.out.println(choiceOne);
        System.out.println(choiceTwo);
        System.out.println(choiceThree);

        Scanner input = new Scanner(System.in);
        String Userinput = input.next();
        if (Userinput.equals(correctAnswer)) {
            System.out.println("Du svarede rigtigt");

        } else {
            System.out.println("det rigtige svar var " + correctAnswer);
        }
    }
}