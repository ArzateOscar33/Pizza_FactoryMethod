
package com.mycompany.factorymethodpizza;
public class NYPizzaStore extends PizzaStore {
//metodo para pizza que heredea de Pizza store , crea una pizza haciendo una instancia del SABOR  de pizza de la tienda de New York
	Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if (item.equals("veggie")) {
			return new NYStyleVeggiePizza();
		} else if (item.equals("clam")) {
			return new NYStyleClamPizza();
		} else if (item.equals("pepperoni")) {
			return new NYStylePepperoniPizza();
		} else return null;
	}
}
