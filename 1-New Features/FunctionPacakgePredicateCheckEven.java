import java.util.function.*;

public class FunctionPacakgePredicateCheckEven{
  public static void main(String [] args){
    Predicate<Integer> p = i -> i%2 == 0;
    System.out.println("is 4 even? : "+p.test(4));
  }
}

/*
OUTPUT
is 4 even? : true
*/
