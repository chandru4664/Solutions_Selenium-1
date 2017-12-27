package htc.training.core;

public class Series {

	public static void main(String[] args) {
		int k=0;
		int l=1;
		// TODO Auto-generated method stub
		for(int i=1;i<100;i++)
		{
				if (i%2!=0)
				{
					k= (l)*(i);
					System.out.print(" "+ k);
					if (k < 0)
					l=1;
					else l=-1;
				}
	
		}
	}

}

