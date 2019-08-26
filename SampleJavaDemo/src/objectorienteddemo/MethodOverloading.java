package objectorienteddemo;

public class MethodOverloading {

	public static void main(String[] args) {

		MethodOverloading m = new MethodOverloading();
		m.sum();
		int s= m.sum(10, 20);
		System.out.println("The addition of two numbers:="+s);
		main();
	}

	public void sum()
	{ 
		System.out.println("zero parameter");
	}
	public int sum(int a, int b)
	{
		int c=a+b;
		return c;
	}
	public static void main()
	{
		System.out.println("overriden main method");
	}

}
