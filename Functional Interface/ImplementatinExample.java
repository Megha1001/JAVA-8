interface Interf{
	public void m1();
}

public class Test{
	public static void main(String [] args){
		Interf i = ()-> System.out.println("Hello...");
    i.m1();
	}
}

/*
OUTPUT : Hello...
*/
