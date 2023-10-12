package polymorphism;

public class TypePramotion {

	
	static void display(float n)
	{
		System.out.println("in float");
		System.out.println(n);
	}
	static void display(long n)
	{
		System.out.println("in long ");
		System.out.println(n);
	}
	
	
	public static void main(String[] args) {
	
		display(5);//here int got  covert in float
		//diplay('a');//if float and int are present
		
	}

}
