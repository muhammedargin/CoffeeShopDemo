package CoffeeShop.business.concrete;

import java.rmi.RemoteException;
import java.util.Locale;

import CoffeeShop.business.Abstract.CustomerCheckService;
import CoffeeShop.entities.concrete.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		var result = true;
		
		try {
			result =client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(new Locale("tr")),
					customer.getLastName().toUpperCase(new Locale("tr")), customer.getBirthDate());
		} 
		catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

}
