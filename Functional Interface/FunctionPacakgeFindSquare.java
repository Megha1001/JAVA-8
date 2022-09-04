import java.util.function.*;

public class FunctionPacakgeFindSquare{
  public static void main(String [] args){
    Function<Integer, Integer> f = i -> i * i; // Function<Input,Output> f = input -> output;
    
    System.out.println("Square of 40 : "+f.apply(40));
    System.out.println("Square of 50 : "+f.apply(50));
  }
}

/*
OUTPUT : 
Square of 401600
Square of 502500
*/
