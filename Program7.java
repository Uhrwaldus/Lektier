
public class Program7 {
    public static void main(String[] args) {
        int x = 55;
        int y = 28;

        int dif = x - y;
        if ( dif < 0 )
            dif = -dif;

        if ( dif > 10 )
            System.out.println( "højere end 10" );
        else
            System.out.println( "lavere end 10" );
        }
    }

