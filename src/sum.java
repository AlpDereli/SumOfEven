import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        int sum = 0;
        Scanner take = new Scanner(System.in);
        System.out.println("Sayı gir: ");
        int sayi = take.nextInt();
        while(sayi%2!=1){
            if (sayi%4==0)
            {
                sum+=sayi;
            }
            System.out.println("Sayı gir: ");
            sayi = take.nextInt();
        }
        System.out.println("Toplam= " + sum);
    }
}
