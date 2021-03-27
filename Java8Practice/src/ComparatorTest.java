import java.util.Arrays;
import java.util.Comparator;

public class ComparatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] ar= {"c","d","b","a","e"};
		InnerClass in = new InnerClass();
		Arrays.parallelSort(ar,in);
		for (String str: ar) {
			System.out.println(str + "");
			Arrays.binarySearch(ar, "b");
		}

	}
	
	static class InnerClass implements Comparator<String>
	{
		public int compare(String s1, String s2) {
			return s2.compareTo(s1);  // reverse sorting
		}
	}

}
