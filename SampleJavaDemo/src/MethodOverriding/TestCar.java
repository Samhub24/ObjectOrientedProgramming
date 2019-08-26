package MethodOverriding;

public class TestCar {

	public static void main(String[] args) {
		BMW b = new BMW();
		b.engine();
		b.start();
		b.stop();
		b.refuel();
		b.threadsafety();
		Car c= new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		Car c1 = new BMW();
		{
			c1.engine();
			c1.start();
			c1.stop();
			c1.refuel();
			
		}

	}

}
