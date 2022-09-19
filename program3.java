import java.util.Scanner;
public class program3 {
    public static void main(String[] args) {

        int first = 9;
        int second = 6;
        int third = 3;


        if ( first >= second && first >= third )
            System.out.println( first );
        else if ( second >= first && second >= third )
            System.out.println( second );
        else
            System.out.println( third );



    }
}
