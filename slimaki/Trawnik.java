
public class Trawnik{

	public int[][] trawnik = new int[10][10];
	public boolean[][] CzyJestTrawa = new boolean[10][10];
	public boolean[][] CzyJestSlimak = new boolean[10][10];
	
	
	public Trawnik(){
		for(int i=0; i<10; i++){
			for(int j=0; j<10; j++){
				trawnik[i][j]=10;
				CzyJestTrawa[i][j]=true;
				CzyJestSlimak[i][j]=false;
			}
		}
	}


}
