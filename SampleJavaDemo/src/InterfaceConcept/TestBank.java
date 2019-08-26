package InterfaceConcept;

public class TestBank {

	public static void main(String[] args) {
		ICICBank i = new ICICBank();
		i.credit();
		i.debit();
		i.transfermoney();
		i.mutualfund();
		i.educationloan();
		i.carloan();
		System.out.println(Usbank.bal);
		Usbank u = new ICICBank();
		u.credit();
		u.debit();
		u.transfermoney();
		Brazilbank b= new ICICBank();
		b.mutualfund();
		
}
}