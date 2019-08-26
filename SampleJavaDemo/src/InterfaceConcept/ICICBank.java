package InterfaceConcept;

public class ICICBank implements Usbank, Brazilbank {

	@Override
	public void mutualfund() {
		System.out.println("Brazilbank- Mutualfund");
		
	}

	@Override
	public void credit() {
		System.out.println("Usbank-credit");
		
	}

	@Override
	public void debit() {
		System.out.println("Usbank-debit");
		
	}

	@Override
	public void transfermoney() {
		System.out.println("Usbank-transfermoney");
		
	}
	
	public void educationloan()
	{
		System.out.println("ICICBank-educationloan");
	}
	
	public void carloan()
	{
		System.out.println("ICICBank- carloan");
	}
	

}
