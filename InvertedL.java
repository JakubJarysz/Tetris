package tetris;

/**
 * Klasa reprezentująca klocek J
 * @author Pitek
 *
 */
public class InvertedL extends Klocek {

	/**
	 * Klasa rysująca klocek
	 */
	public int[][] Draw(int[][] tab, int sign) {
		
		int x = super.getOsX();
		int y = super.getOsY();
		int pos = super.getPosition();
		
		switch(pos) {
		case 1:
			tab[x][y]=sign;
			tab[x][y-1]=sign;
			tab[x-1][y-1]=sign;
			tab[x][y+1]=sign;
			break;
		case 2:
			tab[x][y]=sign;
			tab[x-1][y]=sign;
			tab[x-1][y+1]=sign;
			tab[x+1][y]=sign;
			break;
		case 3:
			tab[x][y]=sign;
			tab[x][y+1]=sign;
			tab[x+1][y+1]=sign;
			tab[x][y-1]=sign;
			break;
		case 4:
			tab[x][y]=sign;
			tab[x+1][y]=sign;
			tab[x+1][y-1]=sign;
			tab[x-1][y]=sign;
			break;
		}
				
		return tab;
	}
	/**
	 * Konstruktor tworzący klocek na początku planszy
	 * 
	 * @param tab macierz przestrzeni gry
	 * @param position pozycja klocka
	 */
	public InvertedL(int[][] tab, int position) {
		super.osX=1;
		super.osY=5;
		super.position=position;
		Draw(tab, 1);
		
	}
	
}
