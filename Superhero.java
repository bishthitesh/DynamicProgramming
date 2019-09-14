/*
* Write a code that gives an output of the minimum number of jumps needed to
* reach the destination provided keeping in mind the restrictions that the superhero can only jump -
A. To the number that is one kilometer lesser than the current distance.
B. To a distance that is half the current distance.
C. To a distance that is ⅓rd the current distance.*/

import java.util.Scanner;
class Superhero
{
    public static int minJump(int n)
    {
        /* Declare an array to store the minimum jumps. */
        int f[] = new int[n+1];
        /* Initialise the base condition */
        f[1]=0;
        /* Fill in the array to find Minimum Jumps from a certain distance */
        for (int i = 2; i <= n; i++) {
            if(i%2==0 && i %3==0)
                f[i] = 1 + Math.min(f[i - 1], Math.min(f[i / 2], f[i / 3]));
            else if(i%2==0 )
                f[i] = 1 + Math.min(f[i - 1], f[i / 2]);
            else if(i%3==0 )
                f[i] = 1 + Math.min(f[i - 1], f[i / 3]);
            else
                f[i] = 1 + f[i - 1];
        }
        return f[n];
    }

    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        int distance = scan.nextInt();
        if(distance>0){
            System.out.println(minJump(distance));
        }
        else {
            System.out.println("Distance should be a positive integer");
        }

    }
}
