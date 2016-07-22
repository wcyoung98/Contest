public class CarNumber {
/*
 * 자동차 번호판 중 오름차순의 번호판이 몇 개가 있는지 구하는 알고리즘
 */
	public static void main(String[] args) {
		String str = "";
		int sum = 0;
		int str1, str2, str3, str4;
		
		for(int i = 1; i < 10000; i++){
			str = String.format("%04d", i);
			str1 = Integer.parseInt(str.substring(0,1));
			str2 = Integer.parseInt(str.substring(1,2));
			str3 = Integer.parseInt(str.substring(2,3));
			str4 = Integer.parseInt(str.substring(3,4));
			
			if(str1 < str2 && str2 < str3 && str3 < str4) sum++;
		}
		System.out.println(sum + "개입니다.");
	}

}