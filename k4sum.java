import java.util.Scanner;

/**
 * @author fatih-git
 */

public class k4sum {

    public static void main(String[] args) {

        int giris, sum=0;
        Scanner input=new Scanner(System.in);

        do{
            System.out.print("Bir sayı girin: ");
            giris=input.nextInt();

            if(giris%4==0){
                sum+=giris;
            }

            System.out.println("Girdiğiniz sayılardan 4'ün katı olanların toplamı= "+sum);
        }while(giris%2==0);

        System.out.println("Tek sayı girildi!");

    }

}
