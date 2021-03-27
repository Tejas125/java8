import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(7);
		double result=sum(list);
		System.out.println(result);
	}

	private static double sum(List<? extends Number> list) {
		double sum=0;
		for (Number num:list) {
			sum+= num.doubleValue();
		}
		return sum;
	}


}
