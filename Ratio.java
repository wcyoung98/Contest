import java.util.ArrayList;

public class Ratio {
/*
 * 남자와 여자의 성비가 어떻게 변하는지 시뮬레이션 되는 알고리즘
 */
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		int men = 0;
		int women = 0;
		int random;
		int personCount = 0;
		
		for(int i = 0; i < 50; i++){
			list.add("여자");
			list.add("남자");
		}
		while(personCount < 100){
			while(true){
				random = (int)(Math.random() * 100);
				if(list.get(random).equals("남자")){
					men++;
					personCount++;
					if(personCount >= 100) break;
					break;
				}
				women++;
				personCount++;
				if(personCount >= 100) break;
			}
		}
		
		System.out.print("여자 : " + (women/10) + "." + (women%10) + ", ");
		System.out.println("남자 : " + (men/10) + "." + (men%10));
	}

}