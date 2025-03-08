import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Taking number from user
        System.out.println("Welcome! Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.");
        System.out.println("Bir sayı giriniz: ");

        int number = scanner.nextInt();

        int sum = 0; //We will use this to add numbers divisors without remainders

        //Checking divisors number without remainders
        for (int i=1 ; i < number; i++){
            if (number%i == 0){
                sum = sum + i;
            }
        }

        //Showing result
        if (sum==number){
            System.out.println(number + " Mükemmel sayıdır.");
        }
        else {
            System.out.println(number + " Mükemmel sayı değildir.");
        }
    }
}