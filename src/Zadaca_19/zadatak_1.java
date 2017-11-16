package Zadaca_19;
public class zadatak_1 {
	
	public static void main(String[] args){
	
		System.out.println("100 nesumicni brojeva: ");
		System.out.println("======================");

		nesumicniBrojevi();

		System.out.println("======================");
		System.out.println("100 nesumicni slova: ");
		System.out.println("======================");

		nesumicniKarakteri();
		System.out.println("======================");

    }

    public static void nesumicniBrojevi(){
        int linija = 0;
        for (int i = 0; i < 100; i++) {
            int x = (int) (Math.random() * 10);
            if (linija == 9) {
                System.out.println(x + " ");
                linija = 0;
            } else {
                System.out.print(x + " ");
                linija++;
            }}}

    public static void nesumicniKarakteri(){
        int linija = 0;
        for (int i = 0; i < 100; i++) {
            char y = (char) ((Math.random() * (('Z' + 1) - 'A')) + 'A');
            if (linija == 9) {
                System.out.println(y + " ");
                linija = 0;
            } else {
                System.out.print(y + " ");
                linija++;
        }}}}
