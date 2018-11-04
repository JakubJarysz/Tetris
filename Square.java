package tetris;

/**
 * Klasa przedstwiaj�ca klocek O
 * @author Pitek
 *
 */
public class Square extends Klocek{
	/**
	 * Funkcja rysuj�ca klocek
	 */
	public int[][] Draw(int[][] tab, int sign) {
		
		int x = super.getOsX();
		int y = super.getOsY();
		
		tab[x][y]=sign;
		tab[x][y+1]=sign;
		tab[x+1][y]=sign;
		tab[x+1][y+1]=sign;
		return tab;
	}
	/**
	 * Konstruktor tworz�cy klocek na pocz�tku planszy
	 * 
	 * @param tab macierz przestrzeni gry
	 * @param position pozycja klocka
	 */
	public Square(int[][] tab, int position) {
		super.osX=0;
		super.osY=5;
		super.position=position;
		Draw(tab, 1);
	}
	/**
	 * Pusta funkcja obracaj�ca klocek, gdy� ten klocek si� nie obraca
	 */
	public int[][] Rotate(int[][] tab){
		
		return tab;
		
	}
}
