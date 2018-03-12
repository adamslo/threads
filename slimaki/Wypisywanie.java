
public class Wypisywanie implements Runnable{

	private Trawnik pole;
	
	Wypisywanie(Trawnik trawnik){
		pole = trawnik;
	}
	
	@Override
	public void run() {
		while(true){
		// TODO Auto-generated method stub
		wypisz();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	}
	
	private void wypisz(){
		for (int i =0; i<10; i++){
			for( int j =0; j<10; j++){
				System.out.print(""+pole.trawnik[i][j]+ " ");
			}
			System.out.print("\n");
		}
		System.out.println("");
	}
	
}
