interface Interf{
	public void add(int a, int b);
	
}


public class Test{
	public static void main(String [] args){
		Interf i = (a,b)->System.out.println("Sum is "+ (a+b));//here , compiler always consider abstract method of Interf, so compiler can able to guess the type
		i.add(10,20);
	}
}

/*
Sum is 30
*/
