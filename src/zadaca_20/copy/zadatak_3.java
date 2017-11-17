package zadaca_20.copy;

public class zadatak_3{
    public static void main(String[] args){
    	
		final int total = 100;
		final int linija = 10;
		int brojac = 1;
		int br = 2;
		
		while (brojac <= total){
			  if (jeLLi(br) && jeLLi2(br)){
			     System.out.print(br + " ");
			     if (brojac % linija == 0)
				 System.out.println();
			     brojac++;
			  }
			  br++;
		}}
    public static boolean jeLLi(int br){
    	if (br == 2)
    	   return true;
    	for (int x = 2; x <= br/2; x++){
    		if (br % x == 0)
    			return false;
    	} 
    	return true;
    }

    public static int rikverc(int br){
    	int test = 0;
    	while (br != 0){
    		  int last = br % 10;
    		  test = test * 10 + last;
    		  br = br / 10;
    	}
    	return test;
    }
    
    public static boolean jeLLi2(int br){
    	return br == rikverc(br);
    }}
