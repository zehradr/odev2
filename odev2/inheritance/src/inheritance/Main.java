package inheritance;
// aslında aynı kodları bir daha bir daha yazmamamıza olanak sağlıyor
public class Main {

	Customer customer = new Customer();
	Employee employee = new Employee(); // böylece temel inheritance'ı oluşturduk
	
	
	EmployeeManager employeeManager = new EmployeeManager();
	CustomerManager customerManager = new CustomerManager();
	
}
