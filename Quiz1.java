import java.util.*;
public class Quiz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] Pos = new int[10];
		boolean Posmove = true;
		Pos[0] = 1;
		for (int i=0; i < 10; i++) {
			System.out.print(Pos[i] + " ");
			}
		while(Posmove) {
			int moveNum = sc.nextInt();
			if (moveNum < 10 && moveNum >=0) {
				for (int j=0; j <10; j++) {
					if (Pos[j] == 1) {
						Pos[j] = 0;
					}
					Pos[moveNum] = 1;
					System.out.print(Pos[j] + " ");
				}
			} else {
				Posmove = false;
			}
		}
	}
}
