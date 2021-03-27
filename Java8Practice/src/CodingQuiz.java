
public class CodingQuiz {

	public static void main(String[] args) {
		System.out.println(findMaxSideOfSquare(1,8));	
	}

	private static int findMaxSideOfSquare(int a,int b) {
		int result=0,sum=0;
		for(int i=(a+b)/4;i>0;i--) {
			sum= a/i + b/i;
			if (sum == 4) {
				result =  i;
				break;
			}
		}
		return result;
	}

}
