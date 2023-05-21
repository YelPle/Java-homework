import java.util.*;
public class Quiz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] Pos = new int[5][5];
		boolean Posmove = true;
		int index = 0;
		int array = 0;
		Pos[index][array] =1;
		 for (int i =0; i < 5; i++) {
			 for (int j =0; j <5; j ++) {
					System.out.print(Pos[i][j] + " ");
			 }
			 System.out.println();
		 }
		while(Posmove) {
			int moveIndex = sc.nextInt();
			if (moveIndex == 1) {
				 for (int i =0; i < 5; i++) {
					 for (int j =0; j <5; j ++) {
							 if (Pos[i][j] == 1) {
								 Pos[i][j] = 0;
							 } 
						 } 
					 	}
				 Pos[index][++array] = 1;
					 } else if (moveIndex == -1) {
				 for (int i =0; i < 5; i++) {
					 for (int j =0; j <5; j ++) {
							 if (Pos[i][j] == 1) {
								 Pos[i][j] = 0;
							 }
					 }
				 }
				 Pos[index][--array] = 1;
			} else if (moveIndex == 2) {
				 for (int i =0; i < 5; i++) {
					 for (int j =0; j <5; j ++) {
							 if (Pos[i][j] == 1) {
								 Pos[i][j] = 0;
							 }
					 }
				 }
				 Pos[++index][array] =1;
			} else if (moveIndex == -2) {
				 for (int i =0; i < 5; i++) {
					 for (int j =0; j <5; j ++) {
							 if (Pos[i][j] == 1) {
								 Pos[i][j] = 0;
							 }
					 }
				 }
				 Pos[--index][array] = 1;
			} else {
				Posmove = false;
			}
			 for (int i =0; i < 5; i++) {
				 for (int j =0; j <5; j ++) {
					 System.out.print(Pos[i][j] + " ");
				 }
				 System.out.println();
			 }
		}
	}
}


