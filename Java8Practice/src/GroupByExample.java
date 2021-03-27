import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByExample {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product("1", "Book", 99L, 50, "Bombay Publisher"));
		products.add(new Product("2", "Pen", 25L, 20, "Raynold"));
		products.add(new Product("3", "Pencil", 10L, 24, "Natraj"));
		products.add(new Product("4", "Notebook", 50L, 24, "Camlin"));
		products.add(new Product("5", "ChinaPen", 35L, 10, "Raynold"));
		products.add(new Product("6", "ApasraPencil", 15L, 12, "Natraj"));
		System.out.println("Product List >>>>");

		// products.stream().forEach(i -> System.out.println(i.toString()));

		// count the number of products in groups
		Map<String, Long> group = products.stream()
				.collect(Collectors.groupingBy(Product::getManufacturer, Collectors.counting()));
		for (String groupName : group.keySet()) {
			System.out.println("Group Name: " + groupName);
			System.out.println("Products: " + group.get(groupName));
			System.out.println("-------------------------------------");
		}
		
		
		// count the Price of products in groups
				Map<String, Long> groupPrice = products.stream()
						.collect(Collectors.groupingBy(Product::getManufacturer, Collectors.counting()));
				for (String groupName : group.keySet()) {
					System.out.println("Group Name: " + groupName);
					System.out.println("Products: " + group.get(groupName));
					System.out.println("-------------------------------------");
				}
	}
}
