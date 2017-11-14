package Zadaca_18;

public class metriStope {
	public static void main(String[] args) {
	    System.out.println("Pretvorimo niz od 10 stopa u metre:");
	    System.out.printf("%5s\t||%8s\n","Stope","Metri");
	    System.out.println("\t\t\t\t");
	    for(double f = 1.0; f <= 10.0; f++){
	    	System.out.printf("%5.1f\t||%7.3f\n", f, stope_u_Metre(f));
	    }}
	
	public static double stope_u_Metre(double foot){
	    return foot * 0.3048;
	}}
