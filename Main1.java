package Question3;

public class Main1 {

	public static void main(String[] args) {
		//create the instance of employee class and enter the value
		Address ad=new Address("N16","VLane","kolkata","West Bengal","700056");
		Department d=new Department("TCL1999","EE","Employee");
		Employee ep=new Employee("Anindya Das",(byte)24,"8240534779",ad,"ABC_010",10000,d);
	
		 
		ep.displayemp();

	}

}