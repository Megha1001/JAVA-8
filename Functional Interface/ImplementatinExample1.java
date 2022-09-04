interface Interf{
	public void m1();
}

public class Test{
	public static void main(String [] args){
		Interf i = ()-> System.out.println("Hello..."); /* we can provide implementation to abstract method by lambda expression, and since we
		can have only one method then this implemenation is surely for that method only */
    		i.m1();
	}
}

/*
OUTPUT : Hello...
*/
