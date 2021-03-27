import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionExamples {
public static void main(String[] args) {
	List<Product> products = new ArrayList<>();
	products.add(new Product("1", "Book", 99L, 6, "Bombay Publisher"));
	products.add(new Product("2", "Pen", 25L, 6, "Raynold"));
	products.add(new Product("3", "Pencil", 10L, 6, "Natraj"));
	products.add(new Product("4", "Notebook", 50L, 6, "Camlin"));
	System.out.println("Product List");
	
	products.stream().forEach(i -> System.out.println(i.getName()+"-"+i.getPrice()+"-"+i.getQuantity()));
	
	int s1=products.stream()
	.mapToInt(p-> p.getQuantity())
	.sum();
	System.out.println("Total Quantity :"+ s1);
	
	Long countBulk = products.stream()
			.filter(p-> p.getPrice() >= 50L)
			.count();
	System.out.println("Filter Price > 50 is "+ countBulk);
	
	/*
	 * Min and Max Function 
	 * */
	
	Product minPriceProduct = products.stream()
			.min((p1,p2) -> (int) (p1.getPrice()- p2.getPrice())).get();
	System.out.println("Product with minimum price is "+ minPriceProduct);
	
	Product maxPriceProduct = products.stream()
			.max((p1,p2) -> (int) (p1.getPrice()- p2.getPrice())).get();
	System.out.println("Product with Maximum price is "+ maxPriceProduct);
	
}
}
