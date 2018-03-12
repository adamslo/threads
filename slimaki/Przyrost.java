
public class Przyrost implements Runnable{

	public Trawnik pole = new Trawnik();
	
	Przyrost(Trawnik t){
		pole = t;
	}
	
	@Override
	public void run() {
		while(true){
		// TODO Auto-generated method stub
		for(int i =0; i<10; i++){
			for(int j =0; j<10; j++){
				if(!pole.CzyJestTrawa[i][j] &&
						!pole.CzyJestSlimak[i][j]){
	
					pole.trawnik[i][j]++;
			}
				if(pole.trawnik[i][j]==10)
					pole.CzyJestTrawa[i][j]=true;
		}
	}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	}

	}
}
