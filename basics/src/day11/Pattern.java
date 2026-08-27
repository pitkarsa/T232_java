package day11;

public class Pattern {
	public static void main(String[] args) {
		for(int i=1; i<=4;i++) {
			for(int j=1; j<= 7; j=j+2) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
