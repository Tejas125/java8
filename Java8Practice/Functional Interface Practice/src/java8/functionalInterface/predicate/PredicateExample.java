// Functional Interface should have one method.
// It should have be Predicate, Function, Consumer, Supplier .

// Predicate Should return boolean value.
package java8.functionalInterface.predicate;


public class PredicateExample {
	@FunctionalInterface
	public interface Predicate<T>{
	//	boolean checkLength(T t);
		boolean checkEligible(T t);
	}
	public static void main(String[] args) {
	//	Predicate<String> predicateFun = t -> t.length() > 5 ;
		Predicate<Integer> predicateFun2 = p -> p > 18 ;
		
		System.out.println(predicateFun2.checkEligible(34));
		System.out.println(predicateFun2.checkEligible(56));
	}
}
