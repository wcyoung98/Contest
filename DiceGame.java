import java.util.Scanner;

public class DiceGame {
/*
 * 주사위게임 알고리즘
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] map = new int[113];
		int[] random = new int[10];
		int player1 = 0, player2 = 0;
		int turn = 1, bomb = 1;
		int dice1, dice2;
		
		for(int i = 1; i <= 100; i++) map[i] = 0;
		
		for(int i = 0; i < 10; i++){
			random[i] = (int)(Math.random() * 100) + 1;
			for(int j = 0; j < i; j++)
				if(random[i] == random[j]){
					i--;
					break;
				}
			map[random[i]] = bomb;
		}
		for(int i = 1; i <= 100; i++){
			if(map[i] == bomb) System.out.print("■ ");
			else System.out.print("□ ");
			if(i % 10 == 0) System.out.println();
		}
		System.out.println();
		while(player1 <= 100 && player2 <= 100){
			System.out.println("--------------------------");
			System.out.println("Player1 : " + player1 + ", Player2 : " + player2);
			System.out.println("--------------------------");
			System.out.println();
			System.out.print("Player" + turn + " : ");
			scan.nextLine();
			dice1 = (int)((Math.random() * 6) + 1);
			dice2 = (int)((Math.random() * 6) + 1);
			if(turn == 1){
				player1 = player1 + (dice1+dice2);
				System.out.println("주사위1 : " + dice1 + ", 주사위2 : " + dice2 + " 합계 : " + (dice1+dice2));
				System.out.println("Player1의 점수는 " + player1 + "입니다.");
				while(true){
					if(map[player1] == bomb){
						System.out.println(player1 + "은(는) 지뢰입니다.");
						player1 = player1 - 2;
						if(player1 < 0) player1 = 0;
						System.out.println("Player1의 점수는 " + player1 + "입니다.");
						continue;
					}
					break;
				}
				System.out.println();
				if(dice1 == dice2) continue;
				turn = 2;
			} else if(turn == 2){
				player2 = player2 + (dice1+dice2);
				System.out.println("주사위1 : " + dice1 + ", 주사위2 : " + dice2 + " 합계 : " + (dice1+dice2));
				System.out.println("Player2의 점수는 " + player2 + "입니다.");
				while(true){
					if(map[player1] == bomb){
						System.out.println(player2 + "은(는) 지뢰입니다.");
						player2 = player2 - 2;
						if(player2 < 0) player2 = 0;
						System.out.println("Player2의 점수는 " + player2 + "입니다.");
						continue;
					}
					break;
				}
				System.out.println();
				if(dice1 == dice2) continue;
				turn = 1;
			}
		}
		if(player1 > player2) System.out.println("Player1의 승리");
		else System.out.println("Player2의 승리");
	}

}