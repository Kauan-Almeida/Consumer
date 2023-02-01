package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product;
import util.PriceUpdate;


public class Program {

	/**Fazer um programa que, a partir de uma lista de produtos, aumente o
	preço dos produtos em 10%.**/
	
	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD Case", 80.90));
		
		list.forEach(p -> p.setPrice(p.getPrice() * 1.1));
		
		list.forEach(System.out::println);
	}		
}