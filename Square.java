package tetris;

/**
 * Klasa przedstwiaj¹ca klocek O
 * @author Pitek
 *
 */
public class Square extends Klocek{
	/**
	 * Funkcja rysuj¹ca klocek
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
	 * Konstruktor tworz¹cy klocek na pocz¹tku planszy
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
	 * Pusta funkcja obracaj¹ca klocek, gdy¿ ten klocek siê nie obraca
	 */
	public int[][] Rotate(int[][] tab){
		
		return tab;
		
	}
}
