package tetris;

public class Vertical extends Klocek{
	
	
	public int[][] Draw(int[][] tab, int sign) {
		
		int x = super.getOsX();
		int y = super.getOsY();
		int pos = super.getPosition();
			
		if(pos==1) {
			tab[x-2][y]=sign;
			tab[x-1][y]=sign;
			tab[x][y]=sign;
			tab[x+1][y]=sign;
		}else {
			tab[x][y-1]=sign;
			tab[x][y]=sign;
			tab[x][y+2]=sign;
			tab[x][y+1]=sign;
		}
		
		return tab;
	}
		
	public int[][] Rotate(int[][] tab){
		Draw(tab, 0);
		setPosition((getPosition()==1 ? 2 : 1));
		Draw(tab, 1);
		return tab;
	}
	
	public Vertical(int[][] tab, int position) {
		super.osX = 2;
		super.osY = 5;
		super.position = position;
		Draw(tab, 1);
	}
	

}
