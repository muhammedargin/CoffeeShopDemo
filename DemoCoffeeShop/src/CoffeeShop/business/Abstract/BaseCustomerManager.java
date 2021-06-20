package CoffeeShop.business.Abstract;

import CoffeeShop.entities.concrete.*;

public abstract class BaseCustomerManager implements CustomerService {
	
	@Override
	public abstract  void save(Customer customer) ;

}
