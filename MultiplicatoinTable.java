import java.util.Scanner;

public class MultiplicatoinTable {
/*
 * 구구단을 그룹별로 출력하는 프로그램
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input;
		int start = 2;
		
		do{
			System.out.println("출력할 그룹을 입력해주세요.");
			input = scan.nextInt();
		}while(1 > input || input > 5);
		
		int row = 9/input;
		
		for(int x = 0; x < 9/row; x++){
			if(start > 9) break;
			for(int i = 1; i <= 9; i++){
				for(int j = start; j < start+row; j++){
					if(j > 9) break;
					System.out.print(j + " * " + i + " = " + (i*j) + "\t");
				}
				System.out.println();
			}
			start = start + row;
			System.out.println();
		}
	}

}