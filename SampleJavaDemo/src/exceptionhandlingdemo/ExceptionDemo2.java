package exceptionhandlingdemo;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		
	
		try {
			System.out.println("/n******Hello World*******/n");
			int i=1/0;
			System.out.println("completed");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
			e.printStackTrace();
		}
		
	}
}


