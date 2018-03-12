import java.util.Random;

public class Ślimak implements Runnable{

	private int WspX, WspY;
	Trawnik pole = new Trawnik();
	
	
	private void losujPolorzenie(){	
		boolean CzySieUdalo = false;
		
		while(!CzySieUdalo){
			Random rand = new Random();
			int wspx = rand.nextInt(10);
			int wspy = rand.nextInt(10);
			
			if(!pole.CzyJestSlimak[wspx][wspy]){
				this.WspX = wspx;
				this.WspY = wspy;
				
				pole.CzyJestSlimak[wspx][wspy] =true;
				CzySieUdalo = true;
			}
		}
	}
Ślimak(Trawnik trawnik){
	pole = trawnik;
	losujPolorzenie(); 
}
	@Override
	public void run() {
		while(true){
		// TODO Auto-generated method stub
			while(pole.trawnik[WspX][WspY]!=0){
				pole.trawnik[WspX][WspY]--;
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
				pole.CzyJestTrawa[WspX][WspY]=false;
				ZmienMiejsce();
				
		}
	}
	private void ZmienMiejsce(){
		Random rand = new Random();
		boolean CzySieUdalo = false;
		int NowyX, NowyY;
		
		
		while(!CzySieUdalo){
			NowyX = rand.nextInt(WspX+1) + (WspX-1);
			NowyY = rand.nextInt(WspY+1) + (WspY-1);
			
			if(NowyX<10 && NowyX>=0 && NowyY<10 && NowyY>=0){
				if(!pole.CzyJestSlimak[NowyX][NowyY] &&
						pole.CzyJestTrawa[NowyX][NowyY]){
				
					pole.CzyJestSlimak[WspX][WspY]=false;
					WspX=NowyX;
					WspY=NowyY;
					pole.CzyJestSlimak[WspX][WspY]=true;
					CzySieUdalo = true;
					
			}
				/*		else{	//sytuacja miejsca bez wyjscia
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}*/
			}

		}
	}
	
	
	
}
