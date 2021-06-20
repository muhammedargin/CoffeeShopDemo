package CoffeeShop.business.Abstract;

import CoffeeShop.entities.concrete.*;

public interface CustomerCheckService {
	public boolean checkIfRealPerson(Customer customer);

}
