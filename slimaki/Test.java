
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Trawnik t = new Trawnik();
		
		Thread s1 = new Thread(new Ślimak(t));
		Thread s2 = new Thread(new Ślimak(t));
		Thread s3 = new Thread(new Ślimak(t));
		Thread w = new Thread(new Wypisywanie(t));
		Thread p = new Thread(new Przyrost(t));
		
		s1.start();
		s2.start();
		s3.start();
		w.start();
		p.start();
	}

}
