interface Interf{
	public void add(int a, int b);
	
}


public class Test{
	public static void main(String [] args){
		Interf i = (a,b)->System.out.println("Sum is "+ (a+b));
		i.add(10,20);
	}
}

/*
Sum is 30
*/
