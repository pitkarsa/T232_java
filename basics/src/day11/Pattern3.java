package day11;

public class Pattern3 {
	public static void main(String[] args) {
		for(int i=4; i>=1; i--) {
			for(int j=1; j<=5; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
/*
1 2 3 4 5 <-- j
---------
4 4 4 4 4
3 3 3 3 3 
2 2 2 2 2
1 1 1 1 1
*/