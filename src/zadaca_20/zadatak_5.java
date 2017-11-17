package zadaca_20;

public class zadatak_5{
	//2 3 5 7 11 101 131 151 181 191 313 353 373 383 727 757 787 797 919 929 ..
	public static void main(String[] args){
        int brojac = 0;
        for (int i = 0; brojac < 100; i++){
            if (jeLLi(i) && jeLLi2(i)){
                System.out.printf("%10d", i);
                brojac++;
                if (brojac % 10 == 0 && i != 0) System.out.println();
            }}}
	
    public static boolean jeLLi(long n){
        if (n < 2) return false;
        for (int i = 2; i <= n / 2; i++){
            if (n % i == 0) return false;
        }
        return true;
    }

    public static long rikverc(long br){
        long rikverc = 0;
        while (br != 0){
        	rikverc *= 10;
        	rikverc += br % 10;
            br /= 10;
        }
        return rikverc;
    }

    public static boolean jeLLi2(long br){
        return (br == rikverc(br));
    }}
