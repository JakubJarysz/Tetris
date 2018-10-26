package tetris;

public abstract class Klocek {
	protected int position;
	protected int osX;
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
	
	public int[][] Draw(int[][] tab, int sign) {
		return tab;
	}
	public int[][] Move(int[][]tab, boolean direction) {
		
		Draw(tab, 0);
		setOsY(getOsY()+(direction ? 1 : -1));
		Draw(tab, 1);
		return tab;
	}
	public int[][] Falling(int[][] tab){
		Draw(tab, 0);
		setOsX(getOsX()+1);
		Draw(tab, 1);
		return tab;
	}
	public int[][] Rotate(int[][] tab){
		Draw(tab, 0);
		setPosition((getPosition()==4 ? 1 : getPosition()+1));
		Draw(tab, 1);
		return tab;
	}
}
