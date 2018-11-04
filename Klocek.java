package tetris;

/**
 * 
 * @author Pitek
 * G��wna abstrakcyjna klasa klocek, zawieraj�ca wsp�lne cechy wszystkich rodzaj�w klock�w.
 */
public abstract class Klocek {
	/**
	 * warto�� od 1-4 wskazuj�ca jak obr�cony jest klocek
	 */
	protected int position;
	/**
	 * Wsp�rz�dna X kluczowego pola w klocku
	 */
	protected int osX;
	/** 
	 * Wsp�rz�dna Y kluczowego pola w klocku
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
	 * Funkcja rysuje figur� na macierzy gry, wpisuj�c dowolny znak w polach klocka
	 * 
	 * @param tab macierz przestrzeni gry
	 * @param sign znak, kt�rym maj� zosta� zast�pione pola klocka (1, 2 lub 0)
	 * @return zwraca tablic� gry po wykonaniu funkcji
	 */
	public int[][] Draw(int[][] tab, int sign) {
		return tab;
	}
	/**
	 * Przesuwa klocek o jedno pole w lewo lub w prawo
	 * 
	 * @param tab macierz przestrzeni gry
	 * @param direction kierunek przusuni�cia klocka (true = prawo, false = lewo)
	 * @return zwraca tablice gry po wykonaniu funkcji
	 */
	public int[][] Move(int[][]tab, boolean direction) {
		
		Draw(tab, 0);
		setOsY(getOsY()+(direction ? 1 : -1));
		Draw(tab, 1);
		return tab;
	}
	/**
	 * Funkcja powoduje opadanie klocka o 1 punkt przy ka�dym wykonaniu
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
	 * Funkcja powoduje wymazanie klocka, obr�t i ponowne narysowanie klocka w nowej pozycji. Zmienia r�wnie� warto�� pola position
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
