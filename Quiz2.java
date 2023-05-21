import java.util.*;
public class Quiz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] Pos = new int[10];
		boolean Posmove = true;
		int array =0;
		Pos[array] = 1;
		for (int i=0; i < 10; i++) {
			System.out.print(Pos[i] + " ");
			}
		while(Posmove) {
			int moveNum = sc.nextInt();
			if (moveNum == 1) {
				 for (int j =0; j < 10; j++) {
					 if (Pos[j] == 1) {
						 Pos[j] = 0;
					 }

				 }
			 Pos[++array] =1;
			} else if (moveNum == -1) {
					for (int j =0; j <10; j++) {
						if (Pos[j] == 1) {
							Pos[j] =0;
						}
					}
				Pos[--array] = 1;
			} else {
				Posmove = false;
			}
				 for (int j =0; j < 10; j++) {
					 System.out.print(Pos[j] + " ");
				
			}
		}
	}
}
