
package com.mycompany.factorymethodpizza;

public abstract class PizzaStore {
 //clase abstracta para poder crear las pizzas 
	abstract Pizza createPizza(String item);
 //metodo para ordenar pizza que retorna un tipo de dato Pizza
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
