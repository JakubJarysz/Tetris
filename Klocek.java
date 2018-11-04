package tetris;

/**
 * 
 * @author Pitek
 * G³ówna abstrakcyjna klasa klocek, zawieraj¹ca wspólne cechy wszystkich rodzajów klocków.
 */
public abstract class Klocek {
	/**
	 * wartoœæ od 1-4 wskazuj¹ca jak obrócony jest klocek
	 */
	protected int position;
	/**
	 * Wspó³rzêdna X kluczowego pola w klocku
	 */
	protected int osX;
	/** 
	 * Wspó³rzêdna Y kluczowego pola w klocku
	 */
	protected int osY;
	
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public int getOsX() {
		return osX;
	}
	public void setOsX(int osX) {
		this.osX = osX;
	}
	public int getOsY() {
		return osY;
	}
	public void setOsY(int osY) {
		this.osY = osY;
	}
	
	/**
	 * Funkcja rysuje figurê na macierzy gry, wpisuj¹c dowolny znak w polach klocka
	 * 
	 * @param tab macierz przestrzeni gry
	 * @param sign znak, którym maj¹ zostaæ zast¹pione pola klocka (1, 2 lub 0)
	 * @return zwraca tablicê gry po wykonaniu funkcji
	 */
	public int[][] Draw(int[][] tab, int sign) {
		return tab;
	}
	/**
	 * Przesuwa klocek o jedno pole w lewo lub w prawo
	 * 
	 * @param tab macierz przestrzeni gry
	 * @param direction kierunek przusuniêcia klocka (true = prawo, false = lewo)
	 * @return zwraca tablice gry po wykonaniu funkcji
	 */
	public int[][] Move(int[][]tab, boolean direction) {
		
		Draw(tab, 0);
		setOsY(getOsY()+(direction ? 1 : -1));
		Draw(tab, 1);
		return tab;
	}
	/**
	 * Funkcja powoduje opadanie klocka o 1 punkt przy ka¿dym wykonaniu
	 * 
	 * @param tab macierz przestrzeni gry
	 * @return zwraca tablice gry po wykonaniu funkcji
	 */
	public int[][] Falling(int[][] tab){
		Draw(tab, 0);
		setOsX(getOsX()+1);
		Draw(tab, 1);
		return tab;
	}
	/**
	 * Funkcja powoduje wymazanie klocka, obrót i ponowne narysowanie klocka w nowej pozycji. Zmienia równie¿ wartoœæ pola position
	 * 
	 * @param tab macierz przestrzeni gry
	 * @return zwraca tablice gry po wykonaniu funkcji
	 */
	public int[][] Rotate(int[][] tab){
		Draw(tab, 0);
		setPosition((getPosition()==4 ? 1 : getPosition()+1));
		Draw(tab, 1);
		return tab;
	}
}
