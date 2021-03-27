import java.io.*;
import java.util.*;

public class Test {
	static int minReservationTables(int[][] reservationStartEndTimes) {
		int result = 0;
		int noOfTable = 0;
		for (int i=0;i<reservationStartEndTimes.length;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(reservationStartEndTimes[i][j]+",");
			}
			System.out.println();
		}
		return result;
          // YOUR CODE HERE
		  

	}

	// DO NOT MODIFY ANYTHING BELOW THIS LINE!!

	public static void main(String[] args) throws IOException {

        int[][] arr = { { 5, 10 }, { 0, 20 },{ 25, 40 }, { 35, 45 } };
		

		int out = minReservationTables(arr);
		System.out.println(out);
	}
}