import animals.Animal;
import animals.Duck;

public class Main {
    public static void main(String[] args) {
       Animal test = new Duck(1, 15, "черный", "хрень");

       System.out.println(test.toString());


    }
}