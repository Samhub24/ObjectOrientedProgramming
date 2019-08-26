package exceptionhandlingdemo;

public class ExceptionDemo {

	public static void main(String[] args) {
		try {
			demo();
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}
	public static void demo() throws Exception
	{
		System.out.println("/n******Hello World*******/n");
		throw new ArithmeticException("This Exception is invalid");
	}

}
