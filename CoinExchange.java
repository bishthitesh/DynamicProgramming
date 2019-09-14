/*
* Given an unlimited supply for few denominations  [1,5,7,10] and an amount n,
* your code should output the number of ways the amount can be paid from the given denominations.
 */

import java.util.Scanner;
public class CoinExchange {
    public static int count(int[] d, int amount) {

        int[][] V = new int[amount + 1][d.length];

        /* Write down the base solution*/
        /* Fill in the rest of the matrix using recursion relation */

        return V[amount][d.length-1];
    }

    public static void main(String args[]) {
        int[] d = {1,5,7,10};
        Scanner scan = new Scanner(System.in);
        int amount = scan.nextInt();
        System.out.println(count(d, amount));
        scan.close();
    }
}
