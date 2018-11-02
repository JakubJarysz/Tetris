package tetris;
import tetris.Mechanics;
public class Tetris {

	public static void main(String[] args) {
		System.out.println("Hello World");
		int[][] tab = new int[][] {{0,0,0,0,0},{0,0,1,0,1},{1,0,1,0,1},{1,1,1,1,1},{1,1,1,1,0}};
	//	Triangle p = new Triangle(tab, 1);
		for(int i = 0; i<tab.length;i++) {
			for(int j = 0; j<tab[i].length;j++) {
				System.out.print(tab[i][j]);
			}
			System.out.println("");
		}
		Mechanics.DeletingRows(tab);
		System.out.println("");
		for(int i = 0; i<tab.length;i++) {
			for(int j = 0; j<tab[i].length;j++) {
				System.out.print(tab[i][j]);
			}
			System.out.println("");
		}
		

	}

}
