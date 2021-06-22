package CoffeeShop.UI;

import CoffeeShop.business.Abstract.*;
import CoffeeShop.business.concrete.*;
import CoffeeShop.business.concrete.*;
import CoffeeShop.entities.Abstract.*;
import CoffeeShop.entities.concrete.*;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new  StarbucksCustomerManager(new MernisServiceAdapter());
		Customer customer = new Customer(1,"Muhammed","Argýn",1995,"270");
		
		
		
		customerManager.save(customer);
		

	}

}
