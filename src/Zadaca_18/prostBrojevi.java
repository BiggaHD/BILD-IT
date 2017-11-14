package Zadaca_18;

	public class prostBrojevi{
		
		static boolean isPrime(int broj){
			boolean jeLLi=true;
		        for(int i=2; i<=(broj/2);i++){
		            if(broj%i==0) {
		                jeLLi=false;
		                break;
		            	}}
		        		return jeLLi;
		    }
			    
		  public static void main(String[] args){
		      int n=10000;
		      System.out.print("Svi prosti brojevi u datom rasponu:\n");
		      for(int b=2; b<=n; b++){
		          if(isPrime(b)==true){
			    	  System.out.println(b + " ");
			    	   }}}}
	