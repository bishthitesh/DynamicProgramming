/*
* Given an unlimited supply for few denominations  [1,5,7,10] and an amount n,
* your code should output the number of ways the amount can be paid from the given denominations.
 */

import java.util.Scanner;
public class CoinExchange {
    public static int count(int[] d, int amount) {

        int[][] V = new int[amount + 1][d.length];

        /* Write down the base solution*/
        for (int j = 0; j < d.length; j++) {
            V[0][j] = 1 ;
        }
        for (int i = 0; i <= amount; i++) {
            V[i][0] =1;
        }
        /* Fill in the rest of the matrix using recursion relation*/
        for (int j = 1; j < d.length; j++) {
            for (int i = 1; i <= amount; i++) {
                if (i>= d[j])
                    V[i][j] = V[i][j - 1] + V[i - d[j]][j];
                else
                    V[i][j] = V[i][j - 1];
                //System.out.println("i="+i+" j="+j+" val="+V[i][j]);
            }
        }
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
