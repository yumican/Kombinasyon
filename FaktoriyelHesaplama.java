import java.util.Scanner;

public class FaktoriyelHesaplama {
    public static void main (String [] args){
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int sayi1 = keyboard.nextInt();
        int sayi2 = keyboard.nextInt();

        int n = 1;
        int r = 1;
        int fark = 1;


        for (int sayac = 1; sayac <= sayi1; sayac++){
            n *= sayac;
        }
        for (int sayac = 1; sayac <= sayi2; sayac++){
            r *= sayac;
        }
        for (int sayac = 1; sayac <= (sayi1-sayi2); sayac++) {
            fark *= sayac;
        }

        int kombinasyon = n/(r*fark);
        System.out.println("C("+sayi1+","+sayi2+"): "+ kombinasyon);





    }
}
