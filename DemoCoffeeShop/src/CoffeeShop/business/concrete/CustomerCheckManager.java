package CoffeeShop.business.concrete;

import java.rmi.RemoteException;
import java.util.Locale;

import CoffeeShop.business.Abstract.CustomerCheckService;
import CoffeeShop.entities.concrete.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		
		return true;
	}

}
