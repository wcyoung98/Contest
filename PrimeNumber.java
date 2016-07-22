import java.util.ArrayList;

public class PrimeNumber {
/*
 * 10억부터 10억 1만 사이의 수 중에서 소수는 몇 개가 있는지 구하는 알고리즘
 */
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList();
		int sum = 0;
		int count = 0;
		int end = 1000010000;
		double squareRoot = Math.sqrt(end);
		int temp = (int)squareRoot;
		
		for(int i = 2; i <= temp; i++){
			for(int j = 2; j <= (i/2); j++){
				if(i % j == 0){
					count++;
					break;
				}
			}
			if(count == 0) list.add(i);
			count = 0;
		}
		count = 0;
		for(int i = 1000000000; i <= end; i++){
			for(int j = 0; j < list.size(); j++){
				if(i % list.get(j) == 0){
					count++;
					break;
				}
			}
			if(count == 0) sum++;
			count = 0;
		}
		
		System.out.println("총 " + sum + " 개");
	}

}