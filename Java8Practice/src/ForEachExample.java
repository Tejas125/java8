import java.util.ArrayList;
import java.util.List;

public class ForEachExample {
	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product("1", "Book", 99L, 6, "Bombay Publisher"));
		products.add(new Product("2", "Pen", 25L, 6, "Raynold"));
		products.add(new Product("3", "Pencil", 10L, 6, "Natraj"));
		products.add(new Product("4", "Notebook", 50L, 6, "Camlin"));
		System.out.println("Product List");

		products.forEach(i -> {
			System.out.println(i.toString());
			System.out.println("--------------------------------------------");
		});
	}
}
