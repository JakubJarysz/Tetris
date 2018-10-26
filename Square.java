package tetris;

public class Square extends Klocek{
	public int[][] Draw(int[][] tab, int sign) {
		
		int x = super.getOsX();
		int y = super.getOsY();
		
		tab[x][y]=sign;
		tab[x][y+1]=sign;
		tab[x+1][y]=sign;
		tab[x+1][y+1]=sign;
		return tab;
	}
	public Square(int[][] tab, int position) {
		super.osX=0;
		super.osY=5;
		super.position=position;
		Draw(tab, 1);
	}
	public int[][] Rotate(int[][] tab){
		
		return tab;
		
	}
}
