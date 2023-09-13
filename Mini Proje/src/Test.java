
import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
        int sayi1,sayi2,sayi3;
        
        System.out.println("1.Sayıyı Giriniz: ");
        sayi1 = scanner.nextInt();
        System.out.println("2.Sayıyı Giriniz: ");
        sayi2 = scanner.nextInt();
        System.out.println("3.Sayıyı Giriniz: ");
        sayi3 = scanner.nextInt();
        
        int maks= -1; //Javanın hata verdirmemesine adına -1 değerini verdik.
        
        if (sayi1 >= sayi2 && sayi1 >= sayi3 ) {
            maks = sayi1;
        }
        else if (sayi2 >= sayi1 && sayi2 >= sayi3) {
            maks = sayi2;
        }
        else {
            maks = sayi3;
        }
        System.out.println("Maksimum Sayı: "+ maks);
    }
}
