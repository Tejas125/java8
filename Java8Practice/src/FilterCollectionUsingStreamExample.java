import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FilterCollectionUsingStreamExample {
	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product("1", "Book", 99L, 6, "Bombay Publisher"));
		products.add(new Product("2", "Pen", 25L, 6, "Raynold"));
		products.add(new Product("3", "Pencil", 10L, 6, "Natraj"));
		products.add(new Product("4", "Notebook", 50L, 6, "Camlin"));
		System.out.println("Product List");
		/*
		 * products.stream().filter(i -> i.getPrice() <= 50L ).forEach(i ->
		 * System.out.println(i.toString()));
		 */

		/*
		 * products.stream().filter(i -> i.getName().equalsIgnoreCase("book"))
		 * .forEach(i -> System.out.println(i.toString()));
		 */
		
		/*	contains Pen used as Like Operator	*/
		/*
		 * products.stream().filter(i -> i.getName().contains("Pen") ).forEach(i ->
		 * System.out.println(i.toString()));
		 */
		
		//products.stream().forEach(i -> System.out.println(i.getName()+"-"+i.getPrice()));
		
		/*
		 * Sort Operator 
		 * 
		 * */
		
		products.stream()
		.sorted((p1,p2) -> (int) (p1.getPrice() - p2.getPrice()))
//		.limit(2)   limit operator
		.filter(i-> !i.getManufacturer().equals("Camlin"))
		.forEach(i -> System.out.println(i.getName()+"-"+i.getPrice()));
		
		/*
		 * Find first element of the stream
		 * */
		System.out.println("--------------------------------------------");
		Product prod=products.stream()
				.findFirst().get();
		System.out.println(prod);
		System.out.println("--------------------------------------------");
		
		products.stream()
				.filter(i-> !i.getManufacturer().equals("Camlin"))
				.forEach(i -> System.out.println(i.getName()+"-"+i.getPrice()));
//		.sorted((p1,p2) -> (int) (p1.getPrice() - p2.getPrice()))
//		.limit(2)   limit operator
//		.filter(i-> !i.getManufacturer().equals("Camlin"))
//		.forEach(i -> System.out.println(i.getName()+"-"+i.getPrice()));
		
		
	}
}
