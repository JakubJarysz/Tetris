package tetris;

public class Tetris {

	public static void main(String[] args) {
		System.out.println("Hello World");
		int[][] tab = new int[10][10];
		Triangle p = new Triangle(tab, 1);
		for(int i = 0; i<tab.length;i++) {
			for(int j = 0; j<tab[i].length;j++) {
				System.out.print(tab[i][j]);
			}
			System.out.println("");
		}
		
		System.out.println("");
		for(int i = 0; i<tab.length;i++) {
			for(int j = 0; j<tab[i].length;j++) {
				System.out.print(tab[i][j]);
			}
			System.out.println("");
		}
		

	}

}
