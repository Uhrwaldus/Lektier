public class Program6 {
    public static void main(String[] args) {

        int x = 10;
        int y = 29;
        int z = 42;


        if(x >=y && y>=z || z>=y && y>=x){
            System.out.println(y);
        } else if( y>=x && x>=z || z>=x && x>=y) {

        }
        else{
            System.out.print(z);
        }



    }
}
