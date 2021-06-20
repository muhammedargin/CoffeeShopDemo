package CoffeeShop.business.concrete;


import CoffeeShop.business.Abstract.BaseCustomerManager;
import CoffeeShop.business.Abstract.CustomerCheckService;
import CoffeeShop.entities.concrete.Customer;

public class StarbucksCustomerManager  extends BaseCustomerManager{

private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		
		this.customerCheckService=customerCheckService;
	}
	

	 
	@Override
	public void save(Customer customer) {
		
		if (customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Saved to db:" + customer.getFirstName());
			
		}
		else {
			
			System.out.println("Not a valid person.");
			
		}
		

}
}