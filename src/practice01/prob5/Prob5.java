package practice01.prob5;

public class Prob5 {
	
	public static void main (String[] args) {
		boolean x,y;

		for(int i=1; i<=99; i++) {
			if(i<10) {
				if((i%3)==0)
					System.out.println(i + "짝");
			}else {
				x = (i/10)%3==0;
				y = (i%10)%3==0;
		if((i%10)==0) 
			y = false; 
		
		if(x&&y)
			System.out.print(i + "짝짝");
		else if(x||y)
			System.out.println(i + "짝");
		}
	}
		
	}
}
