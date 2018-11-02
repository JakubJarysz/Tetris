package tetris;

public class Mechanics {
	public static int[] AllInRow(int[][] tab) {
		int[] fullRows = new int[4];
		int counter = 0;
		for(int i=0; i<tab.length;i++) {
			for(int j=0; j<tab[i].length;j++) {
				if(tab[i][j]==0) {
					break;
				}else if(j==tab[i].length-1) {
					fullRows[counter]=i;
					counter++;
				}
			}
		}
		return fullRows;
		
	}
	public static int[][] DeletingRows(int[][] tab){
		int[] fullRows = AllInRow(tab);
		for(int i=0;i<4;i++) {
			if(fullRows[i]==0) {
				return tab;
			}
			for(int j=fullRows[i];j>0;j--) {
				for(int k=0;k<tab[j].length;k++) {
					if(j==0) {
						tab[j][k]=0;
					}else {
						tab[j][k]=tab[j-1][k];
					}
				}
			}
		}
		return tab;
	}
}

