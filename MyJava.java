/**
 * MyJava
 */
import java.util.Scanner;

public class MyJava {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Input panjang : ");
        float panjang = x.nextFloat();

        System.out.print("Input lebar : ");
        float lebar = x.nextFloat();

        float keliling = 2 * (panjang+lebar);
        System.out.print("Hasil : " +keliling);
        
    }
}