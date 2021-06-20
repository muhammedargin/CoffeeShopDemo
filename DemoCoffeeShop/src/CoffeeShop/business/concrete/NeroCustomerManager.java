package CoffeeShop.business.concrete;

import CoffeeShop.business.Abstract.BaseCustomerManager;
import CoffeeShop.entities.concrete.Customer;

public class NeroCustomerManager extends BaseCustomerManager {

	@Override
	public void save(Customer customer) {
		System.out.println("Saved to db:" + customer.getFirstName());
		
	}

}
