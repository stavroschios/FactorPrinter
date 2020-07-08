import java.util.Arrays;

public class printfactor {
    public static void main(String[] args) {
        getprintfactors(10);
    }
    public static void getprintfactors(int number) {
        if(number < 0) {
            System.out.println("Invalid Value");
        }

        String factors = " ";

        for(int i =1; i <= number; i++ ) {
            if( number % i == 0)
                factors += i + " ";



        }
        System.out.println(factors);
    }

}
