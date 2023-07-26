import java.util.Scanner;

public class CoinChange {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size");
        int size= scanner.nextInt();
        System.out.println("Enter the coins");
        int coins[]=new int[size];
        for (int i = 0; i < size; i++) {
            coins[i]=scanner.nextInt();
        }
        System.out.println("Enter the amount");
        int amount= scanner.nextInt();
        int sum = 0, count = 0;
        for(int iterator = coins.length - 1 ; iterator >= 0 ; iterator--){
            while (sum <= amount){
                if (sum + coins[iterator] <= amount){
                    sum += coins[iterator];
                    count++;
                }else {
                    break;
                }
            }
            if(sum == amount){
                System.out.println(count);
                return;
            }
        }
        System.out.println("-1");
    }
}
